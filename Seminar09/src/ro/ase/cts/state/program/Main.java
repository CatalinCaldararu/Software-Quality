package ro.ase.cts.state.program;

import ro.ase.cts.state.clase.Masa;

public class Main {

	public static void main(String[] args) {
		Masa masa = new Masa(7);
		masa.eliberareMasa();
		masa.rezervaMasa();
		masa.rezervaMasa();
		masa.ocupaMasa();
		masa.ocupaMasa();
		masa.eliberareMasa();
	}

}
