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
 *      Dominik Ertl - Initial UI implementation
 *      Harald Krapfenbauer - TM related parts, UI logic
 */

package org.emonic.debug.remote;



import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.rse.core.model.IHost;
import org.eclipse.rse.files.ui.dialogs.SystemRemoteFolderDialog;
import org.eclipse.rse.subsystems.files.core.subsystems.IRemoteFile;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.emonic.debug.remote.internal.RemoteLaunchingAccess;

public class LaunchConfigurationTab extends AbstractLaunchConfigurationTab {

	private Button btnRemote;
	private Combo comboFileService;
	private Combo comboShellService;
	private Text textRemotePath;
	private Text textRemoteWorkDir;
	private Button browseRemotePath;
	private Button browseRemoteWorkDir;
	private RemoteLaunchingAccess remoteAccess = new RemoteLaunchingAccess();
	private IHost activeFileConnection;

	private void verify() {
		
		if (!btnRemote.getSelection()) {
			comboFileService.setEnabled(false);
			comboShellService.setEnabled(false);
			textRemotePath.setEnabled(false);
			textRemoteWorkDir.setEnabled(false);
			browseRemotePath.setEnabled(false);
			browseRemoteWorkDir.setEnabled(false);
			setErrorMessage(null);
		} else {
			if (!comboFileService.getEnabled() || !comboShellService.getEnabled()) {
				comboFileService.setEnabled(true);
				comboShellService.setEnabled(true);
				fillConnectionCombosAndSelect(null,null);
			}
			// check if a file connection is selected
			if (comboFileService.getSelectionIndex() == -1) {
				setErrorMessage(Messages.RemoteTab_InvalidFileConnection);
				textRemotePath.setEnabled(false);
				textRemoteWorkDir.setEnabled(false);
				browseRemotePath.setEnabled(false);
				browseRemoteWorkDir.setEnabled(false);
			} else {
				activeFileConnection = remoteAccess.getIHostFromString( 
						comboFileService.getItem(comboFileService.getSelectionIndex()));
				if (!textRemotePath.getEnabled())
					textRemotePath.setEnabled(true);
				if (!browseRemotePath.getEnabled())
					browseRemotePath.setEnabled(true);
				if (!textRemoteWorkDir.getEnabled())
					textRemoteWorkDir.setEnabled(true);
				if (!browseRemoteWorkDir.getEnabled())
					browseRemoteWorkDir.setEnabled(true);
				// check if a shell connection is selected
				if (comboShellService.getSelectionIndex() == -1) {
					setErrorMessage(Messages.RemoteTab_InvalidShellConnection);
				} else {
					// check remote path
					if (!remoteAccess.isRemoteDirValid(
							textRemotePath.getText(), activeFileConnection)) {
						setErrorMessage(Messages.RemoteTab_InvalidPath);
					} else {
						// check remote working directory
						if (!remoteAccess.isRemoteDirValid(
								textRemoteWorkDir.getText(), activeFileConnection)) {
							setErrorMessage(Messages.RemoteTab_InvalidWorkDir);
						} else {
							setErrorMessage(null);
						}
					}
				}
			}
		}
		ILaunchConfigurationDialog dialog = getLaunchConfigurationDialog();
		if (dialog != null) {
			dialog.updateButtons();
			dialog.updateMessage();
		}
	}


	private void addListeners() {
		
		btnRemote.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e) {
				verify();
			}
		});
		
		comboFileService.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e) {
				verify();
			}
		});
		
		comboShellService.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				verify();
			}
		});
			
		
		textRemotePath.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				verify();
			}
		});
		
		textRemoteWorkDir.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				verify();
			}
		});
		
		browseRemotePath.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				SystemRemoteFolderDialog fd = new SystemRemoteFolderDialog(
						browseRemotePath.getShell(),
						"Choose remote path",
						activeFileConnection);
				
				IHost currentHost = remoteAccess.getIHostFromString(
						comboFileService.getText());
				IRemoteFile remoteDir = null;
				if (currentHost != null) {
					remoteDir = remoteAccess.getIRemoteFileFromString(
							textRemotePath.getText(), currentHost);
				}
				if (remoteDir != null)
					fd.setPreSelection(remoteDir);
				
				if (Window.OK == fd.open()) {
					textRemotePath.setText(((IRemoteFile)fd.getSelectedObject()).
							getAbsolutePath());
				}
			}
		});
		
		browseRemoteWorkDir.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				SystemRemoteFolderDialog fd = new SystemRemoteFolderDialog(
						browseRemoteWorkDir.getShell(),
						"Choose remote working directory",
						activeFileConnection);
				IHost currentHost = remoteAccess.getIHostFromString(
						comboFileService.getText());
				IRemoteFile remoteDir = null;
				if (currentHost != null) {
					remoteDir = remoteAccess.getIRemoteFileFromString(
							textRemoteWorkDir.getText(), currentHost);
				}
				if (remoteDir != null)
					fd.setPreSelection(remoteDir);
						
				if (Window.OK == fd.open()) {
					if (fd.getSelectedObject() instanceof IRemoteFile)
						textRemoteWorkDir.setText(((IRemoteFile)fd.getSelectedObject()).
								getAbsolutePath());
				}
			}
		});
	}
	
	private void fillConnectionCombosAndSelect(String lastFile, String lastShell) {
		
		// Fill connections with file service
		String[] names = remoteAccess.getFileConnectionNames();
		comboFileService.setItems(names);
		
		if (lastFile != null) {
			int comboIndex = -1;
			for (int i=0; i<names.length; i++) {
				if (lastFile.equals(names[i]))
					comboIndex = i;
			}

			if (comboIndex != -1) {
				comboFileService.select(comboIndex);
				// set active connection
				activeFileConnection = remoteAccess.getIHostFromString(lastFile);
			}
		}
		
		// Fill connections with shell service
		names = remoteAccess.getShellConnectionNames();
		comboShellService.setItems(names);
		
		if (lastShell != null) {
			int comboIndex = -1;
			for (int i=0; i<names.length; i++) {
				if (lastShell.equals(names[i]))
					comboIndex = i;
			}
			if (comboIndex != -1) {
				comboShellService.select(comboIndex);
			}
		}
	}
	
	private void createPathOfTargetGroup(Composite composite) {
		Group group = new Group(composite, SWT.NONE);
		group.setText(Messages.RemoteConfigurationTab_PathOfTargetGroupLabel);
		group.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
		group.setLayout(new GridLayout(2, false));

		textRemotePath = new Text(group, SWT.SINGLE | SWT.BORDER);
		textRemotePath.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING,
				true, false));
		
		browseRemotePath = new Button(group, SWT.PUSH);
		browseRemotePath.setText(Messages.RemoteTab_BrowseRemotePath);

	}

	private void createWorkDirGroup(Composite composite) {
		Group group = new Group(composite, SWT.NONE);
		group.setText(Messages.RemoteConfigurationTab_WorkDirOfTargetGroupLabel);
		group.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
		group.setLayout(new GridLayout(2, false));

		textRemoteWorkDir = new Text(group, SWT.SINGLE | SWT.BORDER);
		textRemoteWorkDir.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING,
				true, false));
		
		browseRemoteWorkDir = new Button(group, SWT.PUSH);
		browseRemoteWorkDir.setText(Messages.RemoteTab_BrowseRemoteWorkDir);

	}

	private void createComboGroup(Composite composite) {
		Group group = new Group(composite, SWT.NONE);
		group.setText(Messages.RemoteConfigurationTab_FileConnectionGroupLabel);
		group.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
		group.setLayout(new GridLayout(1, false));

		comboFileService = new Combo(group, SWT.BORDER | SWT.READ_ONLY);
		comboFileService.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING,
				true, false));
		
		Group group2 = new Group(composite, SWT.NONE);
		group2.setText(Messages.RemoteConfigurationTab_ShellConnectionGroupLabel);
		group2.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
		group2.setLayout(new GridLayout(1, false));
		
		comboShellService = new Combo(group2, SWT.BORDER | SWT.READ_ONLY);
		comboShellService.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING,
				true, false));
	}

	private void createCheckButtonsGroup(Composite composite) {
		Group group = new Group(composite, SWT.NONE);
		group.setText(Messages.RemoteConfigurationTab_CheckButtonsGroupLabel);
		group.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
		group.setLayout(new GridLayout(1, true));
		
		btnRemote = new Button(group, SWT.CHECK);
		btnRemote.setText("Remote launching");
	}
	
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout(1,false));

		createCheckButtonsGroup(composite);
		createComboGroup(composite);
		createPathOfTargetGroup(composite);
		createWorkDirGroup(composite);

		addListeners();
		setControl(composite);

	}

	public String getName() {
		return Messages.RemoteConfigurationTab_TabName;
	}

	public void initializeFrom(ILaunchConfiguration configuration) {

		boolean remoteLaunch = false;
		try {
			remoteLaunch = configuration.getAttribute(
					IDotNetLaunchConfigurationConstants.ATTR_REMOTE_LAUNCHING, false);
		} catch (CoreException e) {
			//ignored
		}
		if (!remoteLaunch) {
			btnRemote.setSelection(false);
			verify();
		} else {
			btnRemote.setSelection(true);
			String lastFileConnection = null, lastShellConnection = null;
			try {
				lastFileConnection = configuration.getAttribute(
						IDotNetLaunchConfigurationConstants.ATTR_REMOTE_FILE, (String)null);
				lastShellConnection = configuration.getAttribute(
						IDotNetLaunchConfigurationConstants.ATTR_REMOTE_SHELL, (String)null);
			} catch (CoreException e) {
				// ignored
			}
			fillConnectionCombosAndSelect(lastFileConnection,lastShellConnection);
			
			String path = "";
			String workDir = "";
			try {
				path = configuration.getAttribute(
						IDotNetLaunchConfigurationConstants.ATTR_REMOTE_PATH, "");
				workDir = configuration.getAttribute(
						IDotNetLaunchConfigurationConstants.ATTR_REMOTE_WORKDIR, "");
			} catch (CoreException e) {
				// ignored
			}
			textRemotePath.setText(path);
			textRemoteWorkDir.setText(workDir);
			
			verify();
		}
	}

	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		
		configuration.setAttribute(
				IDotNetLaunchConfigurationConstants.ATTR_REMOTE_LAUNCHING,
				btnRemote.getSelection());
		configuration.setAttribute(
				IDotNetLaunchConfigurationConstants.ATTR_REMOTE_FILE,
				comboFileService.getSelectionIndex() == -1 ? "" :
					comboFileService.getItem(comboFileService.getSelectionIndex()));
		configuration.setAttribute(
				IDotNetLaunchConfigurationConstants.ATTR_REMOTE_SHELL,
				comboShellService.getSelectionIndex() == -1 ? "" :
					comboShellService.getItem(comboShellService.getSelectionIndex()));
		configuration.setAttribute(
				IDotNetLaunchConfigurationConstants.ATTR_REMOTE_PATH,
				textRemotePath.getText());
		configuration.setAttribute(
				IDotNetLaunchConfigurationConstants.ATTR_REMOTE_WORKDIR,
				textRemoteWorkDir.getText());
	}

	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		// nothing to do
	}
}
