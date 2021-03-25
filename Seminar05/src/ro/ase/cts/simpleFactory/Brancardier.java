package ro.ase.cts.simpleFactory;

public class Brancardier extends PersonalSpital {

	public Brancardier(String nume, int salariu) {
		super(nume, salariu);
	}

	@Override
	public String toString() {
		return "Brancardier [getNume()=" + getNume() + ", getSalariu()=" + getSalariu() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
