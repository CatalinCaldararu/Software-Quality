package ro.ase.cts.flyweight.program;

import ro.ase.cts.flyweight.clase.FlyweightFactory;
import ro.ase.cts.flyweight.clase.Rezervare;

public class Main {

	public static void main(String[] args) {
	Rezervare rezervare1 = new Rezervare(1,4,"10:00");
	Rezervare rezervare2 = new Rezervare(2,5,"11:00");
	Rezervare rezervare3 = new Rezervare(3,6,"13:00");
	
	FlyweightFactory flyweightFactory = new FlyweightFactory();
	flyweightFactory.getClient("0712345").printeazaRezervare(rezervare1);
	flyweightFactory.getClient("0212345").printeazaRezervare(rezervare2);
	flyweightFactory.getClient("0112345").printeazaRezervare(rezervare3);
	}

}
