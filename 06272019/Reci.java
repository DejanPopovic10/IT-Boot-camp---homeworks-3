
package paket;

import java.util.HashMap;

public class Reci {

	public static String izomorfna_Rec(String x, String y) {
		int validator = 0;

		if (x.length() != y.length()) {
			validator = -1;
			String s = "Reci nisu izomorfne";
			return s;
		}

		HashMap<Character, Character> karakteri_Stringa_x = new HashMap<>();
		HashMap<Character, Character> karakteri_Stringa_y = new HashMap<>();

		for (int i = 0; i < x.length(); i++) {
			char a = x.charAt(i);
			char b = y.charAt(i);

			if (karakteri_Stringa_x.containsKey(a)) {
				if (b != karakteri_Stringa_x.get(a)) {
					validator = -1;
					String s = "Reci nisu izomorfne";
					return s;
				}
			} else {
				if (karakteri_Stringa_y.containsKey(b)) {
					validator = -1;
					String s = "Reci nisu izomorfne";
					return s;
				}

				karakteri_Stringa_x.put(a, b);
				karakteri_Stringa_y.put(b, a);
			}
		}
		String s = "Reci su izomorfne";
		return s;
	}

	public static void main(String[] args) throws Exception {

		String a = "noon";
		String b = "fsof";
		System.out.println(izomorfna_Rec(a, b));
	}
}
