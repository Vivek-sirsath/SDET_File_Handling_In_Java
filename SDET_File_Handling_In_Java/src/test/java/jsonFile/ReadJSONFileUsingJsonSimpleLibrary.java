
// There's no need of POJO Classes For reading JSON file using JSON-Simple library.
// We can read JSON file directly using classes like JSONParser, JSONObject, JSONArray.

package jsonFile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJSONFileUsingJsonSimpleLibrary {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {

		// Get the JSON file using FileReader class
		FileReader jsonFile = new FileReader(".\\data\\employee.json"); // FileNotFoundException

		// Create object of JSONParser Class
		JSONParser jsonParser = new JSONParser();

//		Object obj = jsonParser.parse(jsonFile); // Convert json file --> Java Object // IOException, ParseException at this line
//		JSONObject empJsonObj = (JSONObject) obj; // Convert java object --> json onject

		JSONObject empJsonObj = (JSONObject) jsonParser.parse(jsonFile);

		String fName = (String) empJsonObj.get("firstName");
		String lName = (String) empJsonObj.get("lastName");
		System.out.println("First_Name: " + fName);
		System.out.println("Last_Name: " + lName + "\n");

		JSONArray addressArray = (JSONArray) empJsonObj.get("address");

		for (int i = 0; i < addressArray.size(); i++) {
			
			JSONObject address = (JSONObject)addressArray.get(i);
			
			System.out.println(address.get("street"));
			System.out.println(address.get("city"));
			System.out.println(address.get("state") + "\n");
		}

	}

}
