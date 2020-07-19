package testNGscreenshoot;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListerner.class)
public class TestNGSS extends BaseClass {

	@BeforeTest
	public static void init() {
		InnitilizationMethod();
	}

	@Test
	public void Test1() {
		
		
		String s1=d1.getTitle();
		
	Assert.assertEquals(s1, "hurthik");

	}
	@Test
	public void Test4() {
		
		
		String s1=d1.getTitle();
		
	Assert.assertEquals(s1, "hurthik");

	}
	@Test
	public void Test2() {
		
		
		String s1=d1.getTitle();
		
	Assert.assertEquals(s1, "hurthik");

	}
	@Test
	public void Test3() {
		
		
		String s1=d1.getTitle();
		
	Assert.assertEquals(s1, "hurthik");

	}

	@AfterTest
	public void TearDown() {
		d1.close();
	}

}
