package paket;

public class SalterskiRadnik extends Radnik {

	public SalterskiRadnik() {
		super();
		super.setVrstaOsobe("S");
	}

	public void unisti(Lista x) {
		for (int i = 0; i <= x.getSize(); i++) {
			setAdresa(x.getKlijent(i));
			System.out.println(x.getKlijent(i).toString());
			x.delete(i);
		}
	}

	public String toString() {
		String st = super.getVrstaOsobe();
		return st;
	}

}
