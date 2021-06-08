package ro.ase.cts.adapter;

public class LeasingAdapterObiecte implements Creditable {
	private Leasing leasing;
	@Override
	public void oferaCredit() {
		this.leasing.oferaLeasing();
		
	}
	public LeasingAdapterObiecte(Leasing leasing) {
		super();
		this.leasing = leasing;
	}
	

}