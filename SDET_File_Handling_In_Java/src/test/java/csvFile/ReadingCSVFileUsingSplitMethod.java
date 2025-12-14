package csvFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadingCSVFileUsingSplitMethod {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		// Specify CSV file path
		String csvFile = System.getProperty("user.dir") + "\\data\\csvFileData.csv";

		FileReader reader = new FileReader(csvFile); // FileNotFoundException at this line

		BufferedReader br = new BufferedReader(reader);

		String line;

		while ((line = br.readLine()) != null) { // IOException at this line

			String[] data = line.split(",");
			for (String value : data) {
				System.out.print(value + "\t");
			}
			System.out.println();
		}

	}

}
