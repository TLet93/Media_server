/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mediaserver.files;

import java.nio.file.Path;

/**
 *
 * @author Tomek
 */
public enum FileType {
    VIDEO,AUDIO,IMAGE;
    private static String videoExtension = ".avi;.mp4";
    private static String audioExtension = ".mp3";
    private static String imageExtension = ".jpg";
    
    public static FileType getFileType(Path file){
        String fileName = file.getFileName().toString();
        //System.out.println("Path " + file);
        //System.out.println("File Name :" + fileName);
        //String[] extensions = fileName.split("\\.");
        String[] extensions = fileName.split("\\.(?=[^\\.]+$)");
        String extension = extensions[1];
        //System.out.println("Extension :" + extension);
        if (videoExtension.contains(extension)){
            return VIDEO;
        }
        else if (audioExtension.contains(extension)){
            return AUDIO;
        }
        else if (imageExtension.contains(extension)){
            return IMAGE;
        }
        return null;
    }
    
    public static String getExtensions(){
        return videoExtension + ";" +  audioExtension + ";" + imageExtension;
        //return videoExtension;
        //return audioExtension;
        //return imageExtension;
    }
    
    
}
