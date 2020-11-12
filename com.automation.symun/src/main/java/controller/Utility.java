package controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utility {

	FileInputStream file;
	Properties prop;

	public void loadPropertyFile(String path) {
		try {
			file = new FileInputStream(path);
			prop = new Properties();
			prop.load(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getProperty(String key) {
		return prop.getProperty(key);
	}

	public static void main(String[] args) {
		Utility utility = new Utility();
		utility.loadPropertyFile(
				Constants.projectPath+"/src/main/java/controller/test.properties");
		System.out.println(utility.getProperty("name"));
	}
}
