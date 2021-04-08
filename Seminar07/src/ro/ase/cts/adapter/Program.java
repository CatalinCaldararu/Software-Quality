package ro.ase.cts.adapter;

public class Program {
	public static void afiseazaInformatiiCredit(Creditable credit) {
		credit.oferaCredit();
	}
	public static void main(String[] args) {
		//Adapter de obiecte
		Leasing leasing = new Leasing("Popescu");
		LeasingAdapterObiecte adapter= new LeasingAdapterObiecte(leasing);
		afiseazaInformatiiCredit(adapter);
		
		//Adapter de clase
		LeasingAdapterClase leasingAdapterClase = new LeasingAdapterClase("Andrei");
		afiseazaInformatiiCredit(leasingAdapterClase);
		
	}
}