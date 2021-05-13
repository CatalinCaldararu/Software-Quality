package ro.ase.cts.prototype.program;

import ro.ase.cts.prototype.clase.Reteta;

public class Program {

	public static void main(String[] args) {
		Reteta reteta1 = new Reteta("Apa oxigenata",50);
		Reteta reteta2 = (Reteta)reteta1.copiaza();
		
		reteta2.setCantitate(40);
		System.out.println(reteta1);
		System.out.println(reteta2);
	}
}
