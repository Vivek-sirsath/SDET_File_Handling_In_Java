package pdfFile;

import java.awt.Font;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.font.Standard14Fonts;
import org.apache.pdfbox.pdmodel.font.Standard14Fonts.FontName;

public class CreatePDF {

	public static void main(String[] args) throws IOException {
		
		// Create a new empty PDF document
		PDDocument document = new PDDocument();
		
		// Create a page of size A4
		PDPage page = new PDPage(PDRectangle.A4);
		
		// Add page to pdf document
		document.addPage(page);
		
		// Create the content stream.
		PDPageContentStream contentstream = new PDPageContentStream(document, page); // IOException at this line
		
		// Define a font
		// PDType1Font font = new PDType1Font(Standard14Fonts.FontName.COURIER);
		PDType1Font font = new PDType1Font(FontName.COURIER);
		
		// Set font and font size
		contentstream.setFont(font, 14);
		
		contentstream.beginText();
		contentstream.newLineAtOffset(50, 700);
		contentstream.showText("This is a sample pdf created in Java");
		contentstream.endText();
		contentstream.close();
		
		// Save the pdf to desired location
		document.save(".\\data\\createdSample.pdf");
		
		System.out.println("pdf created successfully....");
	}

}
