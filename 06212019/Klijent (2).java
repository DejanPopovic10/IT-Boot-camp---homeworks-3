package rs.itbootcamp.gen4.nedelja8.sluzba;

public class Klijent extends Osoba {
	protected char usluga;
	
	public Klijent() {
		this.usluga = (char) ('a' + (int)(Math.random() * 3));
	}
	
	public char oznaka() {
		return 'K';
	}
	
	public char getUsluga() {
		return usluga;
	}
	
	public String toString() {
		return String.format("%s: %c", super.toString(), usluga);
	}
}
