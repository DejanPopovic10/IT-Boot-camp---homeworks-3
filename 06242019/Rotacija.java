package paket;

public class Rotacija {

	public static void ukloni_karakter(String s, String s1) {
		String temp = s + s;
		if (temp.contains(s1)) {
			System.out.println("True" + " ," + temp.indexOf(s1));
		} else
			System.out.println("False");
	}

	public static void main(String[] args) {

		String x = "tastatura";
		String y = "turatasta";

		ukloni_karakter(x, y);
	}

}
