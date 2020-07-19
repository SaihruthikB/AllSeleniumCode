package pdfReader;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SamplePDFReader {
	
	WebDriver d1;
	
	@Test
	public void SamplePDF() throws IOException
	{
		d1 = new ChromeDriver();
		d1.get("https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf");
		String currentURL=d1.getCurrentUrl();
		URL url = new URL(currentURL);
		InputStream Is = url.openStream();
		BufferedInputStream Buffer =new BufferedInputStream(Is);
		PDDocument Document = null;
		Document =PDDocument.load(Buffer);
		String PDFText =new PDFTextStripper().getText(Document);
		System.out.println(PDFText);
		
		
		
		
		
		
	}
}
