package rs.itbootcamp.gen4.nedelja8.sluzba;

public class Razvodnik extends Radnik {
	private Lista ulazna;
	private Lista[] salteri;
	
	public Razvodnik(Lista ulazna, Lista[] salteri) {
		this.ulazna = ulazna;
		this.salteri = salteri;
	}
	
	@Override
	public void aktivnost() {
		klijent = null;
		if(!ulazna.prazna()) {
			klijent = ulazna.uzmi();
			int index = klijent.usluga - 'a';
			salteri[index].stavi(klijent);
		}
	}

	@Override
	public char oznaka() {
		return 'R';
	}

}
