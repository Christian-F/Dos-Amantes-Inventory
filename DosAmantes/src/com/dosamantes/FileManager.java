package com.dosamantes;

import java.io.File;
 
public class FileManager {
	private static final String DESKTOP_PATH = System.getProperty("user.home") + "/Desktop";
	private static final String ROOT_FOLDER_PATH = DESKTOP_PATH + "/Dos Amantes";
	private static final String APP_DATA_PATH = ROOT_FOLDER_PATH + "/App Data";
	
	static File desktop = new File(DESKTOP_PATH);
	static File rootFolder = new File(ROOT_FOLDER_PATH);
	static File appDataFolder = new File(APP_DATA_PATH);
	static File ingredientsData = new File(APP_DATA_PATH+"/Ingredients.txt");
	//static File ingredientXml = new File(APP_DATA_PATH+"/Ingredients.xml");
	
	public static void startFileManager(){
		checkDirs();
	}
	
	static void checkDirs(){
		if(!rootFolder.exists()){
			if (rootFolder.mkdir()){
			} else {
				
			}
		}
		if(!appDataFolder.exists()){
			if (appDataFolder.mkdir()){
			} else {
				
			}
		}
		if(!ingredientsData.exists()){
			try{
				ingredientsData.createNewFile();
			}catch(Exception e){
				
			}
		}
	}
	
	//**********GETTERS************//
	
	public static String getRootPath(){
		return rootFolder.toString();
	}
	
	public static String getAppDataPath(){
		return rootFolder.toString();
	}
	
//	public static String getIngredientsXml(){
//		return ingredientXml.toString();
//	}
	
	
	
	//************ Ingredient file functions************//
	
	public static void addIng(){
		System.out.println();
	}
	
	public static void deleteIng(){
		
	}
	
	public static void editIng(){
		
	}
}








