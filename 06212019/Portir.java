package paket;

public class Portir extends Radnik {
	private Lista L = new Lista();

	public Lista getL() {
		return L;
	}

	public void setL(Lista l) {
		L = l;
	}

	public Portir() {
		super();
		super.setVrstaOsobe("P");

	}

	public void smestiKlijenta() {
		Klijent x = new Klijent();
		setAdresa(x);
		L.insert(x);

	}

	public String toString() {
		String st = super.toString();
		return st;
	}

}
