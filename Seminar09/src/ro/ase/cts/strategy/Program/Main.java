package ro.ase.cts.strategy.Program;

import ro.ase.cts.strategy.Clase.Card;
import ro.ase.cts.strategy.Clase.Cash;
import ro.ase.cts.strategy.Clase.Client;

public class Main {

	public static void main(String[] args) {
		Client client1 = new Client ("Popescu");
		client1.setModPlata(new Card());
		client1.platesteNota(200);
		
		client1.setModPlata(new Cash());
		client1.platesteNota(150);

	}

}