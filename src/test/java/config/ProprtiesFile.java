package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ProprtiesFile {

	public static void main(String[] args) {

	}
	
	public static void getProperties() throws IOException {
		Properties prop = new Properties();   //created object of class Properties
		String Projectpath = System.getProperty("user.dir"); // location of this current project
		System.out.println(Projectpath);
		String browser = prop.getProperty("browser");
		System.out.println(browser);
		
		InputStream input  = new FileInputStream("E:/SeleniumTrainingByJithendra/Practicals/SeleniumPracticals/Raghavapal/src/test/java/config/config.properties");
		prop.load(input);
			
		   
	}

}
