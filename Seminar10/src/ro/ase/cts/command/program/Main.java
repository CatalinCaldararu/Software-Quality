package ro.ase.cts.command.program;

import ro.ase.cts.command.clase.ComandaConstituire;
import ro.ase.cts.command.clase.ComandaDepunere;
import ro.ase.cts.command.clase.ContBancar;
import ro.ase.cts.command.clase.ManagerComenzi;

public class Main {

	public static void main(String[] args) {
		ManagerComenzi managerComenzi = new ManagerComenzi();
		ContBancar contBancar = new ContBancar("Teo",0);
		managerComenzi.invoca(new ComandaConstituire(contBancar,1000));
		managerComenzi.invoca(new ComandaDepunere(contBancar,1000));
		
		managerComenzi.executaComanda();

	}

}
