package ro.ase.cts.factoryMethod;

public class Program {

    public static void printeazaPersonalSpital(FactoryPersonal factoryPersonal, String nume, int salariu) {
        PersonalSpital personal1 = factoryPersonal.createPersonal(nume, salariu);
        System.out.println(personal1.toString());
    }
    public static void main(String[] args) {
        FactoryPersonal factoryPersonal = new FactoryAsistent();
        printeazaPersonalSpital(factoryPersonal, "Ion", 1200);
    }
}