package rs.itbootcamp.gen4.nedelja8.sluzba;

public class Sluzba {
	private Lista ulazna = new Lista();
	private Lista[] salteri = new Lista[3];
	private Radnik[] radnici = new Radnik[5];
	
	public Sluzba() {
		for(int i=0; i<salteri.length;i++)
			salteri[i] = new Lista();
		
		radnici[0] = new Portir(ulazna);
		radnici[1] = new Razvodnik(ulazna, salteri);
		for(int i=0; i<3; i++)
			radnici[i+2] = new Sluzbenik(salteri[i]);
	}

	public void izvrsi(int brojAktivnosti) {
		for(int i=0; i<brojAktivnosti; i++) {
			int index = (int) (Math.random() * radnici.length); // nasumicni index
			radnici[index].aktivnost();
			System.out.println(radnici[index]);
		}
	}
}
