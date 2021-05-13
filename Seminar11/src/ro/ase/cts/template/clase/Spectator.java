package ro.ase.cts.template.clase;

public class Spectator extends SpectatorAbstract {
	private String nume;
	
	
	public Spectator(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void asezareCoada() {
	System.out.println(nume +" s-a asezat la coada");	
	}


	@Override
	public void prezintaBilet() {
		System.out.println(nume +" prezinta biletul");
	}

	@Override
	public void realizareControlCorporal() {
		System.out.println(nume +" realizeaza control corporal");
	}

	@Override
	public void intraPeStadion() {
		System.out.println(nume +" intra pe stadion");
	}

	@Override
	public void ocupaLoc() {
		System.out.println(nume +" ocupa locul");
	}
}
