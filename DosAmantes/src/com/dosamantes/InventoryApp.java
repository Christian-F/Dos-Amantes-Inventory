package com.dosamantes;

import java.util.List;
import java.util.Scanner;
 
public class InventoryApp {
	
	List<Ingredient> ingredients;
	
	//class controller
	public static void main(String[] args){
		//Window.startWindow();
		startUp();
		while(true){
			console();
		}
	}
	
	static void startUp(){
		FileManager.startFileManager();
		Log.startLog();
		//XmlParser.readIngredients(FileManager.getIngredientsXml());
	}
	
	static void console(){
		Scanner kb = new Scanner(System.in);
		System.out.println("What would you like to do?");
		String ans = kb.next();
	}
}
