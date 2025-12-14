package propertiesFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		// Specify the properties file path
		String filePath = System.getProperty("user.dir") + "\\data\\info.properties";

		// Create object of FileInputStream and pass the filePath
		FileInputStream fis = new FileInputStream(filePath); // FileNotFoundException at this line
		
		// Create object of Properties class
		Properties prop = new Properties();

		// Load the file using Properties class object
		prop.load(fis); // IOException at this line

		// Close the FileInputStream
		fis.close();

		// Read using getProperty() method
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("email"));

		// Print all the properties in set
		Set<String> keys = prop.stringPropertyNames();
		System.out.println(keys); // [name, email, age]
		System.out.println(prop.values()); // [vivek, abc@gmail.com, 35]

		System.out.println("");
		// Print all key values
		for (String key : prop.stringPropertyNames()) {
			System.out.println(key + "\t" + prop.getProperty(key));
		}

	}

}
