package ro.ase.cts.chain.clase;

public class ContCurent extends Handler {

	public ContCurent(float sold) {
		super(sold);
	}

	@Override
	public void realizeazaPlata(float suma) {	
		if(super.getSold()>=suma)
		{	
			super.setSold(super.getSold()-suma);
			System.out.println("S-a realizat plata de "+suma+" din contul curent");
		}
		else
		{
			super.getSuccesor().realizeazaPlata(suma);
		}
	}
	
}
