package ro.ase.cts.factoryMethod;

public class FactoryBrancardier implements FactoryPersonal {
    @Override
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Brancardier(nume, salariu);
    }
}


