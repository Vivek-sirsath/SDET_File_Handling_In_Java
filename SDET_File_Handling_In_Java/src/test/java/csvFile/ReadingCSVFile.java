package csvFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadingCSVFile {

	public static void main(String[] args) throws FileNotFoundException {

		// 1st WAY :- Specify CSV file path
		// String csvFile = System.getProperty("user.dir") + "\\data\\csvFileData.csv";

		// 2nd WAY :- Specify file path using File class
		// File csvFile = new File(System.getProperty("user.dir") + "\\data\\csvFileData.csv");
		
		// 3rd WAY :- Specify file path using FileReader Class
		FileReader csvFile = new FileReader(".\\data\\csvFileData.csv"); // FileNotFoundException

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
