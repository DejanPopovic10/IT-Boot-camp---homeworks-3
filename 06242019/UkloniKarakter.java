package paket;

public class UkloniKarakter {

	public static void ukloni_karakter(String s) {
		String x = "Ala je lep ovaj svet";
		int i = 0;
		while (i < x.length()) {

			if (x.charAt(i) == 'e') {
				String before = x.substring(0, i);
				String after = x.substring(i + 1);
				x = before + after;
			} else
				i++;
		}
		System.out.println(x);

	}

	public static void main(String[] args) {

		String x = "Ala je lep ovaj svet";
		ukloni_karakter(x);
	}
}
