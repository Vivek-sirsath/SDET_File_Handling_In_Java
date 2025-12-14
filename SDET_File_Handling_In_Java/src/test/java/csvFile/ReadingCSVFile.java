package csvFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingCSVFile {

	public static void main(String[] args) throws FileNotFoundException {

		// Specify CSV file path
		// String csvFile = System.getProperty("user.dir") + "\\data\\csvFileData.csv";

		// Specify file path using File class
		File csvFile = new File(System.getProperty("user.dir") + "\\data\\csvFileData.csv");

		// Create object of Scanner class
		Scanner sc = new Scanner(csvFile); // FileNotFoundException

		sc.useDelimiter(",");

		// Read CSV file
		while (sc.hasNext()) {
			System.out.print(sc.next() + "\t");
		}
		
		System.out.println();
		sc.close();
	}

}
