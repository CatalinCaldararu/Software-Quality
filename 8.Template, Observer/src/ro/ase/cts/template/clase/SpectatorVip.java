package ro.ase.cts.template.clase;

public class SpectatorVip extends SpectatorAbstract {
	private String numeVip;
	
	public SpectatorVip(String numeVip) {
		super();
		this.numeVip = numeVip;
	}

	@Override
	public void asezareCoada() {
		System.out.println(numeVip +" se prezinta la poarta stadionului");
	}

	@Override
	public void prezintaBilet() {
		System.out.println(numeVip +" prezinta biletul vip");
	}

	@Override
	public void realizareControlCorporal() {

		System.out.println(numeVip + " realizeaza control corporal");
	}

	@Override
	public void intraPeStadion() {
		System.out.println(numeVip +" intra in tribuna vip");
		
	}

	@Override
	public void ocupaLoc() {
		System.out.println(numeVip +" ocupa loc in tribuna");
		
	}

}
