package samplePackage;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;



public class SampleClass {
	
	public static void main(String[] args) throws FileNotFoundException, MalformedURLException {
		
		File f1 = new File("src");
		File fis = new File(f1,"");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "ApiDemos.apk");
		cap.setCapability(MobileCapabilityType.APP, fis.getAbsolutePath());
		AndroidDriver<AndroidElement> d1 = new AndroidDriver<AndroidElement>(new URL("http://127.0.1.1:4723/wd/hub"), cap);
//		TapAction t1s
		
	}
}
