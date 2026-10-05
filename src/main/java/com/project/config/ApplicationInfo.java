package com.project.config;


public class ApplicationInfo {
    private final String applicationName;
    private final String version;
     public ApplicationInfo(String applicationName, String version){
         this.applicationName = applicationName;
         this.version = version;
     }

     public void displayInfo(){
         System.out.println(applicationName);
         System.out.println("Version : "+version);
         System.out.println();
     }
}
