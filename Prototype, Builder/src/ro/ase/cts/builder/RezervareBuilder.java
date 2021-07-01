package ro.ase.cts.builder;

public class RezervareBuilder implements  AbstractBuilder{
private Rezervare rezervare;

public RezervareBuilder()
{
	rezervare = new Rezervare(0,false, false, false, false,"rock");
}

@Override
public Rezervare build() {
	return rezervare;
}

public RezervareBuilder setAreMancareInclusa(boolean areMancareInclusa)
{
	rezervare.setMancareInclusa(areMancareInclusa);
	return this;
}

public RezervareBuilder setAreScaunErgonomic(boolean areScaunErgonomic)
{
	rezervare.setScaunErgonomic(areScaunErgonomic);
	return this;
}

public RezervareBuilder setAreBauturaRacoritoare(boolean areBauturaRacoritoare)
{
	rezervare.setAreBauturaRacoritoare(areBauturaRacoritoare);
	return this;
}

public RezervareBuilder setAreMuzicaAmbientalaPersonalizata(boolean areMuzicaAmbientalaPersonalizata)
{
	rezervare.setAreMuzicaAmbientalaPersonalizata(areMuzicaAmbientalaPersonalizata);
	return this;
}

public RezervareBuilder setCodRezervare(int codRezervare)
{
	rezervare.setCodRezervare(codRezervare);
	return this;
}

}
