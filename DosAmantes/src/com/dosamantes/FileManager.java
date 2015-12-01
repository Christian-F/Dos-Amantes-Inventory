package com.dosamantes;

import java.io.File;

public class FileManager {
	private static final String DESKTOP_PATH = System.getProperty("user.home") + "/Desktop";
	private static final String ROOT_FOLDER_PATH = DESKTOP_PATH + "/Dos Amantes";
	
	static File desktop = new File(DESKTOP_PATH);
	static File rootFolder = new File(ROOT_FOLDER_PATH);
	
	//runs on startup
	public static void startFileManager(){
		checkDirs();
	}
	
	static void checkDirs(){
		if(!rootFolder.exists()){
			if (rootFolder.mkdir()){
			} else {
				//TODO: handle rootfolder.mkdir() error
			}
		}
	}
	
	public static String getRootPath(){
		return rootFolder.toString();
	}
}
