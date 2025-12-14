package jsonFile;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;

public class ReadJSONFileUsingGsonLibrary {

	public static void main(String[] args) throws FileNotFoundException {

		// Specify JSON file path using FileReader Class
		// [We can not use File Class here]
		FileReader jsonFile = new FileReader(".\\data\\employee.json"); // FileNotFoundException

		// Create object of Gson Class
		Gson gson = new Gson();
		Person person = gson.fromJson(jsonFile, Person.class);

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
