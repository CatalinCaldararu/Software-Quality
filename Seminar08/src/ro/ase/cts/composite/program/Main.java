package ro.ase.cts.composite.program;

import ro.ase.cts.composite.clase.Item;
import ro.ase.cts.composite.clase.Sectiune;

public class Main {

	public static void main(String[] args) {
	Sectiune sectiuneBauturi = new Sectiune("Bauturi");
	Sectiune sectiuneDesert = new Sectiune("Desert");
	Item itemFrappe = new Item("Frappe");
	Item itemCafea = new Item("Cafea");
	Item itemAmandina = new Item("Amandina");
	
	sectiuneBauturi.addComponenta(itemCafea);
	sectiuneBauturi.addComponenta(itemFrappe);
	sectiuneDesert.addComponenta(itemAmandina);
	
	Sectiune meniu = new Sectiune("Meniu");
	meniu.addComponenta(sectiuneDesert);
	meniu.addComponenta(sectiuneBauturi);
	
	meniu.afiseazaDescriere();
	sectiuneBauturi.stergeComponenta(itemFrappe);
	sectiuneDesert.addComponenta(itemFrappe);
	
	meniu.afiseazaDescriere();
	//comm
	}

}
