package ro.ase.cts.strategy.Clase;

public class Card implements ModalitatePlata {

	@Override
	public void plateste(double sumaPlatita) {
	System.out.println("A fost realizata plata cu cardul pentru suma de "+ sumaPlatita);
	}

}
