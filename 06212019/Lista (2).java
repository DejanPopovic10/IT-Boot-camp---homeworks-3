package rs.itbootcamp.gen4.nedelja8.sluzba;

// jedan element u ulancanoj listi sadrzi klijenta i referencu na naredni element
class Element{
	Klijent klijent;
	Element sledeci = null;
	public Element(Klijent klijent) {
		this.klijent = klijent;
	}
}

public class Lista {
	private Element pocetak = null;
	private Element kraj = null;
	
	public void stavi(Klijent klijent) {
		if(kraj != null)
			kraj = kraj.sledeci = new Element(klijent);
		else
			pocetak = kraj = new Element(klijent);
	}
	
	public boolean prazna() {
		if(pocetak == null)
			return true;
		return false;
	}
	
	public Klijent uzmi() throws NullPointerException {
		if(pocetak == null)
			throw new NullPointerException("Lista je prazna!");
		
		// uzimamo klijenta sa pocetka
		Klijent klijent = pocetak.klijent;
		
		// novi pocetak postaje sledeci element tako sto preskacemo i efektivno ubijamo prethodnog
		pocetak = pocetak.sledeci;
		
		// ako je poceetak postao null onda smo skinuli i poslednji element pa valja azurirati kraj
		if(pocetak == null)
			kraj = null;
		
		// vracamo klijenta
		return klijent;
	}
	
}
