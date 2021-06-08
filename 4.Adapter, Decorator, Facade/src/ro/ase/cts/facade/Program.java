package ro.ase.cts.facade;

public class Program {

	public static void main(String[] args) {
		Persoana persoana = new Persoana("Maricica", "2995485642209");
		Persoana persoanaNoua = new Persoana("Gigel","1995485642214");
		
		//fara facade
		if(persoana.getVarsta()>=18) {
			if(Politie.esteUrmaritDePolitie(persoana)) {
				if(BirouDeCredite.areCreante(persoana))
					System.out.println(persoana.getNume() +" primeste credit");
				
				else System.out.println(persoana.getNume() +" nu primeste credit");
			}
			else System.out.println(persoana.getNume() +" nu primeste credit");
		}
		else System.out.println(persoana.getNume() +"nu primeste credit");
			
		//cu facade
		
		if(Facade.esteApt(persoanaNoua))
			System.out.println(persoanaNoua.getNume() + " primeste credit");
		else
			System.out.println(persoanaNoua.getNume() + " nu primeste credit");
	}

}