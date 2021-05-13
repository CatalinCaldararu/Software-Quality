package ro.ase.cts.template.program;

import ro.ase.cts.template.clase.Spectator;
import ro.ase.cts.template.clase.SpectatorAbstract;
import ro.ase.cts.template.clase.SpectatorVip;

public class Main {

	public static void main(String[] args) {
		Spectator spectator1 = new Spectator("Marcel");
		SpectatorAbstract spectator2 = new Spectator("George");
		
		spectator1.intrareSpectatorStadion();
		spectator2.intrareSpectatorStadion();
		
		SpectatorVip spectator3 =new SpectatorVip("Alin");
		spectator3.intrareSpectatorStadion();
	}

}
