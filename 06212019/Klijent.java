package paket;

public class Klijent extends Osoba {

	private String vrstaUsluge;
	Klijent next;

	public Klijent() {
		super();
		super.setVrstaOsobe("K");
		this.next = next;
		double x = Math.random();
		if (x >= 0 && x < 0.3) {
			vrstaUsluge = "a";
		} else if (x >= 0.3 && x < 0.6) {
			vrstaUsluge = "b";
		} else
			vrstaUsluge = "c";

	}

	public String getVrstaUsluge() {
		return vrstaUsluge;
	}

	public String toString() {
		String st = super.toString() + "(" + getVrstaUsluge() + ")";
		return st;
	}
}
