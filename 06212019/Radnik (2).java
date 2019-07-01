package rs.itbootcamp.gen4.nedelja8.sluzba;

abstract public class Radnik extends Osoba {
	protected Klijent klijent = null;
	
	// aktivnost koju izvrsava
	public abstract void aktivnost();
	
	public String toString() {
		if(klijent != null)
			return String.format("%s obradjuje %s", super.toString(), klijent.toString());
		return super.toString();
	}
}
