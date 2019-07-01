package rs.itbootcamp.gen4.nedelja8.sluzba;

public class Sluzbenik extends Radnik{

	private Lista salter;
	public Sluzbenik(Lista salter) {
		this.salter = salter;
	}
	
	@Override
	public void aktivnost() {
		klijent = null;
		if(!salter.prazna())
			klijent = salter.uzmi();
	}

	@Override
	public char oznaka() {
		return 'S';
	}

}
