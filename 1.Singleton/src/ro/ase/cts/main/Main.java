package ro.ase.cts.main;
import ro.ase.cts.clase.ConcursArcasi;
import ro.ase.cts.clase.DepartamentFinanciar;
import ro.ase.cts.clase.DepartamentFinanciarEager;

public class Main {

	public static void main(String[] args) {
		DepartamentFinanciarEager departamentFinanciarEager1= DepartamentFinanciarEager.getInstance();
		DepartamentFinanciarEager departamentFinanciarEager2= DepartamentFinanciarEager.getInstance();
		System.out.println(departamentFinanciarEager1.toString());
		System.out.println(departamentFinanciarEager2.toString());
		
		departamentFinanciarEager1.setDirector("Gigel");
		departamentFinanciarEager2.setNrAngajati(20);
		System.out.println(departamentFinanciarEager1.toString());
		System.out.println(departamentFinanciarEager2.toString());
		
		DepartamentFinanciar departamentFinanciar1= DepartamentFinanciar.getInstance(20,"Popescu",2500);
		DepartamentFinanciar departamentFinanciar2= DepartamentFinanciar.getInstance(30,"Avramescu",2700);
		
		System.out.println(departamentFinanciar1.toString());
		System.out.println(departamentFinanciar1.toString());
		
		ConcursArcasi concursArcasi1= ConcursArcasi.getInstance(100,"Urluescu",3000);
		ConcursArcasi concursArcasi2= ConcursArcasi.getInstance(200,"Mateescu",5000);
		
		System.out.println(concursArcasi1.toString());
		System.out.println(concursArcasi2.toString());
	}
}
