package paket;

public class SalterskaSluzba {

	private Lista ulazna;
	private Lista Salterska1;
	private Lista Salterska2;
	private Lista Salterska3;
	private Portir Pero;
	private Razvodnik e;
	private SalterskiRadnik a;
	private SalterskiRadnik b;
	private SalterskiRadnik c;

	public SalterskaSluzba() {
		
		
		
		
	}

	public void aktivnost() {

		double x = Math.random();
		if (x >= 0 && x < 0.2) {

			Portir Pero = new Portir();
			Pero.smestiKlijenta();
			System.out.println(Pero.toString());
			Pero.smestiKlijenta();
			System.out.println(Pero.toString());
			Pero.smestiKlijenta();
			System.out.println(Pero.toString());

		} else if (x >= 0.2 && x < 0.4) {
			Razvodnik e = new Razvodnik();
			Lista ulazna = new Lista();
			if (ulazna.getSize() >0) {

				e.sortiranjePoA(ulazna);
				e.sortiranjePoB(ulazna);
				e.sortiranjePoC(ulazna);

			}
		} else if (x >= 0.4 && x < 0.6) {
			SalterskiRadnik a = new SalterskiRadnik();
			Razvodnik e = new Razvodnik();
			Salterska1=e.sortiranjePoA(ulazna);
			if (Salterska1.getSize() >0) {
				a.unisti(Salterska1);

			}
		} else if (x >= 0.6 && x < 0.8) {
			SalterskiRadnik b = new SalterskiRadnik();
			Razvodnik e = new Razvodnik();
			Salterska2=e.sortiranjePoB(ulazna);
			if (Salterska2.getSize() > 0) {
				b.unisti(Salterska2);

			}
		} else if (x >= 0.8 && x < 1) {
			SalterskiRadnik c = new SalterskiRadnik();
			Razvodnik e = new Razvodnik();
			Salterska3=e.sortiranjePoC(ulazna);
			if (Salterska3.getSize() > 0) {
				c.unisti(Salterska3);

			}
		}
	}

	public static void main(String[] args) {

		SalterskaSluzba a = new SalterskaSluzba();
		a.aktivnost();
	}
}
