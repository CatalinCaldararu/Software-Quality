package ro.ase.cts.simpleFactory;

public class Asistent extends PersonalSpital{

	public Asistent(String nume, int salariu) {
		super(nume, salariu);
	}

	@Override
	public String toString() {
		return "Asistent [getNume()=" + getNume() + ", getSalariu()=" + getSalariu() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
