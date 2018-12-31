/**
 * Virtual Machines for Embedded Multimedia - VIMEM
 *
 * Copyright (c) 2008 University of Technology Vienna, ICT
 * (http://www.ict.tuwien.ac.at)
 * All rights reserved.
 *
 * This file is made available under the terms of the 
 * Eclipse Public License v1.0 which is available at 
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *      Harald Krapfenbauer - initial API and implementation
 */

package org.emonic.debug.remote.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.variables.VariablesPlugin;
import org.eclipse.osgi.service.environment.Constants;

public class Helpers {

	// this code was merely copied from org.eclipse.debug.internal.core.LaunchManager!
	public static String[] getEnvironment(Map envMap) throws CoreException {

		if (envMap == null) {
			return null;
		}
		Map env = new HashMap();
		
		// Add variables from config
		Iterator iter= envMap.entrySet().iterator();
		boolean win32= Platform.getOS().equals(Constants.OS_WIN32);
		Map.Entry entry = null;
		String key = null;
		String value = null;
		Object nativeValue = null;
		Iterator envIter = null;
		Map.Entry nativeEntry = null;
		String nativeKey = null;
		while (iter.hasNext()) {
			entry = (Map.Entry) iter.next();
			key = (String) entry.getKey();
            value = (String) entry.getValue();
            // translate any string substitution variables
            if (value != null) {
            	value = VariablesPlugin.getDefault().getStringVariableManager().performStringSubstitution(value);
            }
            boolean added= false;
			if (win32) {
                // First, check if the key is an exact match for an existing key.
				nativeValue = env.get(key);
                if (nativeValue != null) {
                    // If an exact match is found, just replace the value
                    env.put(key, value);
                } else {
                    // Win32 variables are case-insensitive. If an exact match isn't found, iterate to
                    // check for a case-insensitive match. We maintain the key's case (see bug 86725),
                    // but do a case-insensitive comparison (for example, "pAtH" will still override "PATH").
                    envIter = env.entrySet().iterator();
                    while (envIter.hasNext()) {
                        nativeEntry = (Map.Entry) envIter.next();
                        nativeKey = (String) (nativeEntry).getKey();
                        if (nativeKey.equalsIgnoreCase(key)) {
                            nativeEntry.setValue(value);
                            added = true;
                            break;
                        }
                    }
                }
			}
            if (!added) {
                env.put(key, value);
            }
		}		
		
		iter = env.entrySet().iterator();
		List strings = new ArrayList(env.size());
		StringBuffer buffer = null;
		while (iter.hasNext()) {
			entry = (Map.Entry) iter.next();
			buffer = new StringBuffer((String) entry.getKey());
			buffer.append('=').append((String) entry.getValue());
			strings.add(buffer.toString());
		}
		return (String[]) strings.toArray(new String[strings.size()]);
	}
	
}
