package j300_if_else;

public class _002_Example {

	static String checkNumber(int x) {

		String result;

		if (x > 0)
			result = "Positive";

		else if (x < 0)
			result = "Negative";

		else
			result = "Zero";

		return "Your number is :" + result;

	}

	public static void main(String[] args) {

		System.out.println(checkNumber(5));
		System.out.println(checkNumber(0));
		System.out.println(checkNumber(-4));
	}

}
