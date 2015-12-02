package com.dosamantes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Log {
	
	static File log = new File(FileManager.getRootPath()+ "/log.txt");
	static boolean logExists = log.exists();
	 
	public static void createLog(){
		if(!logExists){
			try{
				log.createNewFile();
				Write("Folders and log created successfully.");
			} catch (IOException e){
				e.printStackTrace();
			}
		}
	}
	
	public static void Write(String toWrite){
		Date date = new Date();
		
		try{
			FileWriter fw = new FileWriter(log, true);
			BufferedWriter writer = new BufferedWriter(fw);
			
			writer.newLine();
			writer.write(date.toString() + ": " + toWrite);
			writer.close();
			
		} catch (Exception e) {
			//TODO: Handle log.write errors.
		}
	}
	
	public static void startLog(){
		createLog();
	}
}