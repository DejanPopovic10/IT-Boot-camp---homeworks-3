package rs.itbootcamp.gen4.nedelja8.sluzba;

public class Portir extends Radnik {
	private Lista ulazna;
	
	public Portir(Lista ulazna) {
		this.ulazna = ulazna;
	}
	
	@Override
	public char oznaka() {
		return 'P';
	}

	@Override
	public void aktivnost() {
		klijent = new Klijent();
		ulazna.stavi(klijent);
	}

}
