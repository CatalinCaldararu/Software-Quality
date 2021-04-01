package ro.ase.cts.builder2;

public class Rezervare {
 private int codRezervare;
 private boolean mancareInclusa;
 private boolean scaunErgonomic;
 private boolean areBauturaRacoritoare;
 private boolean areMuzicaAmbientalaPersonalizata;
 private String genMuzica;
 
public Rezervare(int codRezervare, boolean mancareInclusa, boolean scaunErgonomic, boolean areBauturaRacoritoare,
		boolean areMuzicaAmbientalaPersonalizata, String genMuzica) {
	super();
	this.codRezervare = codRezervare;
	this.mancareInclusa = mancareInclusa;
	this.scaunErgonomic = scaunErgonomic;
	this.areBauturaRacoritoare = areBauturaRacoritoare;
	this.areMuzicaAmbientalaPersonalizata = areMuzicaAmbientalaPersonalizata;
	this.genMuzica = genMuzica;
}

public int getCodRezervare() {
	return codRezervare;
}

public void setCodRezervare(int codRezervare) {
	this.codRezervare = codRezervare;
}

public boolean isMancareInclusa() {
	return mancareInclusa;
}

public void setMancareInclusa(boolean mancareInclusa) {
	this.mancareInclusa = mancareInclusa;
}

public boolean isScaunErgonomic() {
	return scaunErgonomic;
}

public void setScaunErgonomic(boolean scaunErgonomic) {
	this.scaunErgonomic = scaunErgonomic;
}

public boolean isAreBauturaRacoritoare() {
	return areBauturaRacoritoare;
}

public void setAreBauturaRacoritoare(boolean areBauturaRacoritoare) {
	this.areBauturaRacoritoare = areBauturaRacoritoare;
}

public boolean isAreMuzicaAmbientalaPersonalizata() {
	return areMuzicaAmbientalaPersonalizata;
}

public void setAreMuzicaAmbientalaPersonalizata(boolean areMuzicaAmbientalaPersonalizata) {
	this.areMuzicaAmbientalaPersonalizata = areMuzicaAmbientalaPersonalizata;
}

public String getGenMuzica() {
	return genMuzica;
}

public void setGenMuzica(String genMuzica) {
	this.genMuzica = genMuzica;
}

@Override
public String toString() {
	return "Rezervare [codRezervare=" + codRezervare + ", mancareInclusa=" + mancareInclusa + ", scaunErgonomic="
			+ scaunErgonomic + ", areBauturaRacoritoare=" + areBauturaRacoritoare
			+ ", areMuzicaAmbientalaPersonalizata=" + areMuzicaAmbientalaPersonalizata + ", genMuzica=" + genMuzica
			+ "]";
}
 
 
}
