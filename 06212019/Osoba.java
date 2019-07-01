package paket;

public abstract class Osoba {
	private static int idGlobal = 1;
	private int id;
	private String vrstaOsobe;

	public Osoba() {
		super();
		this.id = idGlobal;
		idGlobal++;
		this.vrstaOsobe = vrstaOsobe;
	}

	public int getId() {
		return id;
	}

	public String getVrstaOsobe() {
		return vrstaOsobe;
	}

	public void setVrstaOsobe(String vrstaOsobe) {
		this.vrstaOsobe = vrstaOsobe;
	}

	public String toString() {
		String st = vrstaOsobe + id;
		return st;
	}
}
