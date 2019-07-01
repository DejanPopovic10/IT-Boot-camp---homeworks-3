package paket;

public class Cezar {
	public static void Cezar(String s, int x) {

		String temp = "abcdefghijklmnopqrstuvwxyz";
		String rezultat = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == ' ')
				rezultat = rezultat + c;
			for (int j = 0; j < temp.length(); j++) {

				if (s.charAt(i) == temp.charAt(j)) {

					if ((j + x) >= temp.length()) {

						j = (j + x) - temp.length();
						rezultat = rezultat + temp.charAt(j);
						;
						break;
					}

					else {
						rezultat = rezultat + temp.charAt(j + x);
						break;
					}
				}
			}
		}
		System.out.print(rezultat);

	}

	public static void main(String[] args) {
		String x = "danas je lep dan";

		int y = 9;
		Cezar(x, y);
	}

}
