package ro.ase.cts.prototype;

public class Bilet implements AbstractPrototype {
private int codBilet;
private String echipa1;
private String echipa2;
private String data;
private String loc;


public Bilet(int codBilet, String echipa1, String echipa2, String data, String loc) {
	super();
	//validari costisitoare
	this.codBilet = codBilet;
	this.echipa1 = echipa1;
	this.echipa2 = echipa2;
	this.data = data;
	this.loc = loc;
}


public void setCodBilet(int codBilet) {
	this.codBilet = codBilet;
}


public void setLoc(String loc) {
	this.loc = loc;
}


@Override
public String toString() {
	return "Bilet [codBilet=" + codBilet + ", echipa1=" + echipa1 + ", echipa2=" + echipa2 + ", data=" + data + ", loc="
			+ loc + "]";
}


@Override
public AbstractPrototype copiaza() {
	Bilet bilet = new Bilet();
	bilet.codBilet = this.codBilet;
	bilet.data = this.data;
	bilet.echipa1= this.echipa1;
	bilet.echipa2 = this.echipa2;
	bilet.loc=this.loc;
	return bilet;
}


public Bilet() {
	super();
}







}
