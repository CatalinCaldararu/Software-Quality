package ro.ase.cts.observer.program;

import ro.ase.cts.observer.clase.ClientFidel;
import ro.ase.cts.observer.clase.ManagerSala;

public class Main {

	public static void main(String[] args) {
		ClientFidel c1 = new ClientFidel("Gigel");
		ClientFidel c2 = new ClientFidel("Marcel");
		ClientFidel c3 = new ClientFidel("Viorica");
		
		ManagerSala manager = new ManagerSala();
		manager.adaugaAbonat(c1);
		manager.adaugaAbonat(c2);
		manager.adaugaAbonat(c3);
		
		manager.anuntaMeci("Fotbal");
		
		manager.stergeAbonat(c1);
		manager.anuntaMeci("Handbal");
	}

}
