package ro.ase.cts.command.clase;

public class ComandaRetragere extends Comanda {

	
	public ComandaRetragere(ContBancar contBancar, float suma) {
		super(contBancar, suma);
	
	}

	@Override
	public void executa() {
	super.contBancar.retragere(super.suma);		
	}

}
