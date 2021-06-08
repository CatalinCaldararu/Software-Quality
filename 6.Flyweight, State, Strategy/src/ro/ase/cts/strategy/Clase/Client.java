package ro.ase.cts.strategy.Clase;

public class Client {
 private String nume;
 private ModalitatePlata modPlata;
 
 
public Client(String nume) {
	super();
	this.nume = nume;
	this.modPlata = new Card();
}


@Override
public String toString() {
	return "Client [nume=" + nume + ", modPlata=" + modPlata + "]";
}
 

public void setModPlata(ModalitatePlata modPlata) {
	this.modPlata = modPlata;
}

public void platesteNota(double suma) {
	System.out.println("Clientul "+nume +" are de platit nota!");
	modPlata.plateste(suma);
	
}
 
}
