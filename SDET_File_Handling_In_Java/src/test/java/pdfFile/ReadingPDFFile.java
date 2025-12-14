package pdfFile;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class ReadingPDFFile {

	public static void main(String[] args) throws IOException {

		// Specify file path using File class
		File pdfFile = new File(".\\data\\sample.pdf");

		// Load PDF document
		PDDocument doc = Loader.loadPDF(pdfFile); // PDFBox above 3.x versions // IOException at this line
		
		// Create object of 'PDFTextStripper' Class
		PDFTextStripper pdfStripper = new PDFTextStripper();
		
		String text = pdfStripper.getText(doc);
		
		doc.close();
		
		System.out.println(text);

	}

}
