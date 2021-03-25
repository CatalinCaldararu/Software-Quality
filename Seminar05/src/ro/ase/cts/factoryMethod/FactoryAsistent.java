package ro.ase.cts.factoryMethod;

public class FactoryAsistent implements FactoryPersonal {
    @Override
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Asistent(nume, salariu);
    }
}
