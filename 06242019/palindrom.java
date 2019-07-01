package paket;

public class palindrom {

	public static boolean palindrom(String s) {
		String temp = "";

		for (int j = s.length() - 1; j >= 0; j--) {
			temp = temp + s.charAt(j);
		}
		if (s.equals(temp))
			return true;
		else

			return false;

	}

	public static void main(String[] args) {

		String x = "anavolimilovana";

		System.out.println(palindrom(x));
	}

}
