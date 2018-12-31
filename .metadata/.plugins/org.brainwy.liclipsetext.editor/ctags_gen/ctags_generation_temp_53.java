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

package org.emonic.debug.remote;

public interface IDotNetLaunchConfigurationConstants {

	public static final String ATTR_REMOTE_LAUNCHING = EmonicDebugRemote.PLUGIN_ID
			+ ".REMOTE_LAUNCHING"; //$NON-NLS-1$

	public static final String ATTR_REMOTE_SHELL = EmonicDebugRemote.PLUGIN_ID
			+ ".REMOTE_SHELL"; //$NON-NLS-1$

	public static final String ATTR_REMOTE_FILE = EmonicDebugRemote.PLUGIN_ID
			+ ".REMOTE_FILE"; //$NON-NLS-1$
	
	public static final String ATTR_REMOTE_PATH = EmonicDebugRemote.PLUGIN_ID
			+ ".REMOTE_PATH"; //$NON-NLS-1$

	public static final String ATTR_REMOTE_WORKDIR = EmonicDebugRemote.PLUGIN_ID
			+ ".REMOTE_WORKDIR"; //$NON-NLS-1$
}
