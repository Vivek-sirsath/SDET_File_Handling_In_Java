package csvFile;

import java.io.FileWriter;
import java.io.IOException;

public class WritingCSVFile {

	public static void main(String[] args) throws IOException {

		// Create CSV file dynamically and store file path
		String csvFile = System.getProperty("user.dir") + "\\data\\csvFileData.csv";

		// Create object of FileWriter class to write the data to CSV file.
		FileWriter writer = new FileWriter(csvFile);

		writer.append("Name,Age,Email \n");
		writer.append("Vivek,35,abc@gmail.com \n");
		writer.append("Ishita,19,ish@gmail.com \n");
		writer.append("Deepika,29,deep@gmail.com \n");

		writer.close();

		System.out.println("CSV file created... " + csvFile);

	}

}
