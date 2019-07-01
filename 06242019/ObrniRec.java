package paket;

import java.util.Arrays;

public class ObrniRec {

	public static void obrni_rec(String s) {
		StringBuffer x = new StringBuffer();
		int k = 0;
		String sub = "";
		for (int i = 0; i < s.length(); i++) {
			String temp = "";

			if (s.charAt(i) == ' ' || i == s.length() - 1) {
				if (i == s.length() - 1) {
					sub = s.substring(k, i + 1);
				} else {
					sub = s.substring(k, i);
				}
				k = i + 1;
				for (int j = sub.length() - 1; j >= 0; j--) {
					temp = temp + sub.charAt(j);

				}
				x.append(temp + " ");
			}

		}

		System.out.println(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "danas je divan dan";
		obrni_rec(x);
	}

}
