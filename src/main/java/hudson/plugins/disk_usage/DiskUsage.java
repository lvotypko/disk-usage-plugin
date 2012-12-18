/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hudson.plugins.disk_usage;

/**
 *
 * @author Lucie Votypkova
 */
public class DiskUsage extends BuildDiskUsage {
    
    long lockedBuildUsage;
    
   public DiskUsage(long buildDiskUsage,long wsDiskUsage, long lockedBuildUsage) {
        super(buildDiskUsage, wsDiskUsage);
        this.lockedBuildUsage=lockedBuildUsage;
    }
   
   public long getLockedBuildUsage() {
        return lockedBuildUsage;
    }

    public String getLockedBuildUsageString() {
        return getSizeString(lockedBuildUsage);
    }
    
    public long getUnockedBuildUsage() {
        return buildUsage - lockedBuildUsage;
    }

    public String getUnlockedBuildUsageString() {
        return getSizeString(buildUsage - lockedBuildUsage);
    }

}
