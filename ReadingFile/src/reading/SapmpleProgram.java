package reading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class SapmpleProgram {

	public static void main(String[] args) throws IOException {
		Properties p1 = new Properties();
		FileInputStream fis = new FileInputStream("//Users//admin//Documents//workspace//ReadingFile//src//reading//reading.properties");
		p1.load(fis);
		System.out.println(p1.getProperty("name"));
		System.out.println(p1.getProperty("age"));
		
		
	}

}
