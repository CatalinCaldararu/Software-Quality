package ro.ase.cts.builder2;

public class RezervareBuilder implements AbstractBuilder {
	 private int codRezervare;
	 private boolean mancareInclusa;
	 private boolean scaunErgonomic;
	 private boolean areBauturaRacoritoare;
	 private boolean areMuzicaAmbientalaPersonalizata;
	 private String genMuzica;
	 

	public RezervareBuilder setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
		return this;
	}

	public RezervareBuilder setMancareInclusa(boolean mancareInclusa) {
		this.mancareInclusa = mancareInclusa;
		return this;
	}

	public RezervareBuilder setScaunErgonomic(boolean scaunErgonomic) {
		this.scaunErgonomic = scaunErgonomic;
		return this;
	}

	public RezervareBuilder setAreBauturaRacoritoare(boolean areBauturaRacoritoare) {
		this.areBauturaRacoritoare = areBauturaRacoritoare;
		return this;
	}

	public RezervareBuilder setAreMuzicaAmbientalaPersonalizata(boolean areMuzicaAmbientalaPersonalizata) {
		this.areMuzicaAmbientalaPersonalizata = areMuzicaAmbientalaPersonalizata;
		return this;
	}

	public RezervareBuilder setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
		return this;
	}

	@Override
	public Rezervare build() {
		Rezervare rezervare = new Rezervare(codRezervare, mancareInclusa, scaunErgonomic, areBauturaRacoritoare, areMuzicaAmbientalaPersonalizata,genMuzica);
		return rezervare;
	}
	
	
	 
	 
}
