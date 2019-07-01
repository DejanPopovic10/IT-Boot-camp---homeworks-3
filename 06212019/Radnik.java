package paket;

public abstract class Radnik extends Osoba {

	private Klijent adresa;

	public Radnik() {
		super();

	}

	public String toString() {
		
		String st = super.getVrstaOsobe() + "(" + getAdresa().toString() + ")";

		return st;
	}

	public Klijent getAdresa() {
		return adresa;
	}

	public void setAdresa(Klijent adresa) {
		this.adresa = adresa;
	}

}
