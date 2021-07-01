package ro.ase.cts.chain.clase;

public class ContDeEconomii extends Handler {

	public ContDeEconomii(float sold) {
		super(sold);
	}

		@Override
		public void realizeazaPlata(float suma) {	
			if(super.getSold()>=suma)
			{	
				super.setSold(super.getSold()-suma);
				System.out.println("S-a realizat plata de "+suma+" din contul de economii");
			}
			else
			{
				super.getSuccesor().realizeazaPlata(suma);
			}
		
	}

}
