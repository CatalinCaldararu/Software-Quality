package ro.ase.cts.builder2;

public class Program {

	public static void main(String[] args) {
		RezervareBuilder builder = new RezervareBuilder().setCodRezervare(1).setAreBauturaRacoritoare(true);
		Rezervare rezervare1 = builder.build();
		builder.setCodRezervare(2);
		Rezervare rezervare2= builder.build();
		
		System.out.println(rezervare1.toString());
		System.out.println(rezervare2.toString());
	}

}
