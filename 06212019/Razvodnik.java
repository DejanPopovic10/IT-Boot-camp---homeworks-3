package paket;

public class Razvodnik extends Radnik {

	public Razvodnik() {

		super();
		super.setVrstaOsobe("R");
	}

	public Lista sortiranjePoA(Lista x) {

		Lista a = new Lista();
		if (x.getSize() > 0) {
			for (int i = 0; i < x.getSize(); i++) {

				if (x.getKlijent(i).getVrstaUsluge().equals("a")) {
					a.insert(x.getKlijent(i));
					setAdresa(x.getKlijent(i));
					System.out.println(x.getKlijent(i).toString());
					x.delete(i);
					i--;
				}
			}
		}

		return a;

	}

	public Lista sortiranjePoB(Lista x) {

		Lista b = new Lista();
		if (x.getSize() > 0) {
			for (int i = 0; i < x.getSize(); i++) {

				if (x.getKlijent(i).getVrstaUsluge().equals("b")) {
					b.insert(x.getKlijent(i));
					setAdresa(x.getKlijent(i));
					System.out.println(x.getKlijent(i).toString());
					x.delete(i);
					i--;
				}
			}
		}

		return b;

	}

	public Lista sortiranjePoC(Lista x) {

		Lista c = new Lista();
		if (x.getSize() > 0) {
			for (int i = 0; i < x.getSize(); i++) {

				if (x.getKlijent(i).getVrstaUsluge().equals("c")) {
					c.insert(x.getKlijent(i));
					setAdresa(x.getKlijent(i));
					System.out.println(x.getKlijent(i).toString());
					x.delete(i);
					i--;
				}
			}
		}

		return c;

	}

	public String toString() {
		String st = super.toString();
		return st;
	}

	{

	}
}