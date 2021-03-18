package ro.ase.cts.clase;

public class DepartamentFinanciarEager {
private int nrAngajati;
private String director;
private double salariulDeBaza;

private static DepartamentFinanciarEager departamentFinanciarEager = new DepartamentFinanciarEager(10,"Marcel",1000);

private DepartamentFinanciarEager(int nrAngajati, String director, double salariulDeBaza){
	this.director = director;
	this.nrAngajati=nrAngajati;
	this.salariulDeBaza=salariulDeBaza;
}

public static DepartamentFinanciarEager getInstance(){
	return departamentFinanciarEager;
}

@Override
public String toString() {
	return "DepartamentFinanciarEager [nrAngajati=" + nrAngajati + ", director=" + director + ", salariulDeBaza="
			+ salariulDeBaza + "]";
}

public void setNrAngajati(int nrAngajati) {
	this.nrAngajati = nrAngajati;
}

public void setDirector(String director) {
	this.director = director;
}

public void setSalariulDeBaza(double salariulDeBaza) {
	this.salariulDeBaza = salariulDeBaza;
}

}
