package pdf;

import java.io.File;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class GeneratePDF {
	public static void main(String[] args) throws Exception{
		
	
	Document document = new Document();
    PdfWriter.getInstance(document, new FileOutputStream(new File("./sample1.pdf")));
    document.open();
    Image img = Image.getInstance("./apple.jpeg");
    document.add(new Paragraph("Sample 1: This is simple image demo."));
    document.add(img);
    document.close();
    System.out.println("Done");
}
}