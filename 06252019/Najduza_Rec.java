
package palet;

import java.io.*;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;

public class Najduza_Rec {

	static TimerTask task = new TimerTask() {
		public void run() {

			System.out.println("Нажалост, време је истекло!");
			System.exit(0);

		}
	};

	public static String getInput() throws Exception {
		Timer timer = new Timer();
		timer.schedule(task, 60 * 1000);

		String azbuka = "АБВГДЂЕЖЗИЈКЛЉМНЊОПРСТЋУФХЦЧЏШ";
		int brojSlova = 12;
		String zadato = "";
		for (int i = 0; i < brojSlova; i++) {
			azbuka.charAt((int) (Math.random() * 30));
			zadato = zadato + azbuka.charAt((int) (Math.random() * 30));

		}
		System.out.println("Задата слова су: " + zadato);
		System.out.println("Имате 60 секунди. Унесите вашу реч: ");
		Scanner s = new Scanner(System.in);

		String rec = s.next();
		int validator = rec.length();

		while (validator != -1) {
			validator = rec.length();
			for (int i = 0; i < rec.length(); i++) {

				for (int j = 0; j < zadato.length(); j++) {
					if (rec.charAt(i) == zadato.charAt(j)) {
						validator--;
						zadato = zadato.substring(0, j) + zadato.substring(j + 1);
						break;
					}
				}
			}
			try {
				BufferedReader br = new BufferedReader(new FileReader("recnik"));

				String linija = br.readLine();
				while (linija != null) {
					if (linija.toUpperCase().equals(rec.toUpperCase())) {
						validator--;
						break;
					}
					linija = br.readLine();

				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

			if (validator == -1) {
				System.out.println("Освојили сте " + rec.length() * 2 + " поена");
				break;
			} else {
				System.out.println("Користили сте недозовољена слова! Пробајте опет");
				s = new Scanner(System.in);
				rec = s.next();
			}
		}
		timer.cancel();
		System.out.println("Унели сте: " + rec);
		return rec;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		getInput();

	}
}