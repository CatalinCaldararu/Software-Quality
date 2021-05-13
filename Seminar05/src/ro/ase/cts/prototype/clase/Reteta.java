package ro.ase.cts.prototype.clase;

public class Reteta implements RetetaMedicament {
	private String solutie;
	private int cantitate;
	
	public String getSolutie() {
		return solutie;
	}
	public int getCantitate() {
		return cantitate;
	}
	
	public void setSolutie(String solutie) {
		this.solutie = solutie;
	}
	public void setCantitate(int cantitate) {
		this.cantitate = cantitate;
	}
	public Reteta() {
		super();
	}
	
	public Reteta(String solutie, int cantitate) {
		super();
		this.solutie = solutie;
		this.cantitate = cantitate;
	}
	
	@Override
	public String toString() {
		return "Reteta [solutie=" + solutie + ", cantitate=" + cantitate + "]";
	}
	
	@Override
	public RetetaMedicament copiaza() {
	Reteta reteta = new Reteta();
	reteta.solutie = this.solutie;
	reteta.cantitate = this.cantitate;
	return reteta;
	}
	

}
