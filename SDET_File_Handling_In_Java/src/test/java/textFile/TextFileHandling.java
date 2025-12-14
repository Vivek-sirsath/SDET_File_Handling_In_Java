package textFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFileHandling {

	// Create text file
	public static void createTxtFile(String filePath) throws IOException {

		File txtFileObj = new File(filePath);

		if (txtFileObj.createNewFile()) { // IOException at this line
			System.out.println("Created new file..." + txtFileObj.getName());
		} else {
			System.out.println("File already exist.");
		}
	}

	public static void writeFile(String filePath) throws IOException {

		FileWriter writerObj = new FileWriter(filePath);
		writerObj.write("This is text file handling in Java...");
		writerObj.close();
		System.out.println("Successfully written in file.");

	}

	public static void readFile(String filePath) throws FileNotFoundException {

		File fileObj = new File(filePath);

		Scanner sc = new Scanner(fileObj);

		while (sc.hasNextLine()) {
			String data = sc.nextLine();
			System.out.println(data);
		}

		sc.close();
	}
	
	public static void renameFile(String oldFilePath, String newFilePath) {
		
		// Create file objects for OldFilePath and NewFilePath
		File oldFile = new File(oldFilePath);
		File newFile = new File(newFilePath);
		
		if(oldFile.exists()) {
			oldFile.renameTo(newFile);
			System.out.println("Old file renamed to: " + newFilePath);
		} else {
			System.out.println("File not renamed");
		}
	}
	
	public static void deleteFile(String filePath) {
		
		File fileObj = new File (filePath);
		
		if (fileObj.exists()) {
			fileObj.delete();
			System.out.println("Text file deleted...");
		} else {
			System.out.println("File not exists.");
		}
	}

	public static void main(String[] args) throws IOException {

		String txtFilePath = "C:\\Users\\admin\\Desktop\\myTextFile.txt";

		// Creating a text file
		createTxtFile(txtFilePath); // IOException

		// Writing in a text file
		writeFile(txtFilePath);

		// reading the text file
		readFile(txtFilePath);
		
		// Renaming the text file
		String newTextFilePath = "C:\\Users\\admin\\Desktop\\RenamedTextFile.txt";
		renameFile(txtFilePath, newTextFilePath);
		
		// Deleting the text file
		deleteFile(newTextFilePath);

	}

}
