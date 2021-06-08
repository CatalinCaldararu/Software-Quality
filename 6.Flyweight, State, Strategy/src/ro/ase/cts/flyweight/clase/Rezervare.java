package ro.ase.cts.flyweight.clase;

public class Rezervare {
 private int numarMasa;
 private int numarPersoane;
 private String oraRezervare;
 
 
public Rezervare(int numarMasa, int numarPersoane, String oraRezervare) {
	super();
	this.numarMasa = numarMasa;
	this.numarPersoane = numarPersoane;
	this.oraRezervare = oraRezervare;
}


@Override
public String toString() {
	return "Rezervare [numarMasa=" + numarMasa + ", numarPersoane=" + numarPersoane + ", oraRezervare=" + oraRezervare
			+ "]";
}


 
 
}
