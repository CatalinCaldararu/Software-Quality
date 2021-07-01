package ro.ase.cts.strategy.Clase;

public class Cash implements ModalitatePlata {

	@Override
	public void plateste(double sumaPlatita) {
	System.out.println("A fost realizata plata cash pentru suma de "+ sumaPlatita);
	}

}
