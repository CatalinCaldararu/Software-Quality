package ro.ase.cts.adapter;

public class LeasingAdapterClase extends Leasing implements Creditable {

	public LeasingAdapterClase(String nume) {
		super(nume);
	}
	
	@Override
	public void oferaCredit()
	{
		super.oferaLeasing();
	}

}
