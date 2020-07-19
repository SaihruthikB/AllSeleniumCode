package SeleniumProject.AllSeleniumPrograms;

public class String_reverse {
	static String Actual = "hruthik";

	public static void main(String[] args) {

		String output = ReverseAString(Actual);
		System.out.println(output);

	}

	public static String ReverseAString(String Actual) {

		String reverse = "";

		for (int i =Actual.length()-1; i>=0;i--) {
			reverse = reverse+Actual.charAt(i);
		}

		return reverse;

	}
}
