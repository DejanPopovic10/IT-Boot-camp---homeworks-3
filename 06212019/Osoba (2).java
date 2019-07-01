package rs.itbootcamp.gen4.nedelja8.sluzba;

public abstract class Osoba {
	private static int nextId = 1;
	private final int id = nextId++;
	
	abstract public char oznaka();
	
	public String toString() {
		return String.format("%c#%d", oznaka(), id);
	}
}
