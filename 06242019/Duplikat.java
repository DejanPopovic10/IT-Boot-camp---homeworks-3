package paket;

public class Duplikat {

	public static void duplikati(String s) {

		for (int i = 0; i < s.length(); i++) {
			String sub = s.substring(0, i);
			int brojac = 1;
			for (int j = i + 1; j < s.length(); j++) {
				int k;
				for (k = 0; k < sub.length(); k++) {
					if (s.charAt(j) == sub.charAt(k))
						break;
				}

				if (k == sub.length()) {

					if (s.charAt(i) == s.charAt(j)) {
						brojac++;
					}
				}
			}
			if (brojac != 1) {
				System.out.print(s.charAt(i));
				System.out.print(":" + brojac);
				System.out.println("");

			}
		}
	}

	public static void main(String[] args) {
		String x = "programiranje";

		duplikati(x);

	}

}
