package propertiesFile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritingPropertiesFile {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		// Create a properties file and store the file path in a variable
		String filePath = System.getProperty("user.dir") + "\\data\\info.properties";

		// Create object of FileOutputStream to write data to properties file
		FileOutputStream fos = new FileOutputStream(filePath); // FileNotFoundException at this line

		// Create Properties class object to enter data to properties file.
		Properties prop = new Properties();

		prop.setProperty("name", "vivek");
		prop.setProperty("email", "abc@gmail.com");
		prop.setProperty("age", "35");

		prop.store(fos, "Writing data to properties file"); // IOException at this line

		// Close the FileOutputStream
		fos.close();

		System.out.println("Properties data written in file: " + filePath);

	}

}
