package ro.ase.cts.factoryMethod;

public class FactoryAnestezist implements FactoryPersonal{

	@Override
	public PersonalSpital createPersonal(String nume, int salariu) {
		return new Anestezist(nume, salariu);
	}
}
