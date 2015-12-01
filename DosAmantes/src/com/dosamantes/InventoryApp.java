package com.dosamantes;

public class InventoryApp {
	
	//class controller
	public static void main(String[] args){
		//Window.startWindow();
		startUp();
	}
	
	static void startUp(){
		FileManager.startFileManager();
		Log.startLog();
	}
}
