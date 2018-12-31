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

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {

	private static final String BUNDLE_NAME = "org.emonic.debug.remote.messages"; //$NON-NLS-1$

	public static String RemoteConfigurationTab_FileConnectionGroupLabel;
	public static String RemoteConfigurationTab_ShellConnectionGroupLabel;
	public static String RemoteConfigurationTab_PathOfTargetGroupLabel;
	public static String RemoteConfigurationTab_CheckButtonsGroupLabel;
	public static String RemoteConfigurationTab_TabName;
	public static String RemoteConfigurationTab_WorkDirOfTargetGroupLabel;
	public static String RemoteTab_InvalidFileConnection;
	public static String RemoteTab_InvalidShellConnection;
	public static String RemoteTab_InvalidPath;
	public static String RemoteTab_InvalidWorkDir;
	public static String RemoteTab_BrowseRemotePath;
	public static String RemoteTab_BrowseRemoteWorkDir;
	
	static {
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

}
