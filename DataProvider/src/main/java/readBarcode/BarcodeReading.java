package readBarcode;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class BarcodeReading {
	
	WebDriver d1;
	@Test
	public void Reader() throws IOException, NotFoundException
	{
		d1 = new ChromeDriver();
		d1.get("https://barcode.tec-it.com/en");
		String barcode=d1.findElement(By.tagName("img")).getAttribute("src");
		URL url= new URL(barcode);
		BufferedImage bufferedImage = ImageIO.read(url);
		LuminanceSource lusource=new BufferedImageLuminanceSource(bufferedImage);
		BinaryBitmap binaizer= new BinaryBitmap(new HybridBinarizer(lusource));
		Result result=new MultiFormatReader().decode(binaizer);
		System.out.println(result);
		
	}

}
