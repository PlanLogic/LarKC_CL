package org.emonic.base.buildmechanism;
// Build mechanisms which implement this interface deliver a build command which emonic uses 
// to build the project
public interface IBuildCommandRunner {
    String getFullBuildCommand();
    //String getTargetBuildCommand(String affectedTargets);
    String getTargetBuildCommand(String[] affectedTargets);
}
