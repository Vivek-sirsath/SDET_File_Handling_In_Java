package jsonFile;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadJSONFileUsingJacksonDatabindLibrary {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {

//		// Specify JSON file path using File Class
//		File jsonFile = new File(".\\data\\employee.json");
		
		// Get the JSON file using FileReader class
		FileReader jsonFile = new FileReader(".\\data\\employee.json"); // FileNotFoundException

		// Create object of ObjectMapper Class
		ObjectMapper objMap = new ObjectMapper();

		// Read the data from the file and map to Person Class
		// Pass jsonFile and a Class which we need to map.
		Person person = objMap.readValue(jsonFile, Person.class); // StreamReadException, DatabindException, IOException

		// Access data from JSON file
		System.out.println("First_Name: " + person.getFirstName());
		System.out.println("Last_Name: " + person.getLastName() + "\n");

		// To read Addresses...
		for (Address address : person.getAddress()) {
			System.out.println(address.getStreet());
			System.out.println(address.getCity());
			System.out.println(address.getState() + "\n");
		}

	}

}
