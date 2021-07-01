package ro.ase.cts.chain.program;

import ro.ase.cts.chain.clase.Handler;
import ro.ase.cts.chain.clase.ContCurent;
import ro.ase.cts.chain.clase.ContDeCredit;
import ro.ase.cts.chain.clase.ContDeEconomii;
import ro.ase.cts.chain.clase.RefuzaTranzactia;

public class Program {
 
public static void main(String[] args)
 {
	 Handler contDeCredit = new ContDeCredit(5000);
	 Handler contCurent = new ContCurent(2000);
	 Handler contDeEconomii = new ContDeEconomii(1000);
	 Handler refuzaTranzactia = new RefuzaTranzactia();
	 
	 contCurent.setSuccesor(contDeEconomii);
	 contDeEconomii.setSuccesor(contDeCredit);
	 contDeCredit.setSuccesor(refuzaTranzactia);
	 
	 contCurent.realizeazaPlata(500);
	 contCurent.realizeazaPlata(2500);
	 contCurent.realizeazaPlata(2000);
 }
}
