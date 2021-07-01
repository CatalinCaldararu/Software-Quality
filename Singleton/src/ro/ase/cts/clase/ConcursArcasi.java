package ro.ase.cts.clase;

public class ConcursArcasi {
	private int nrArcasi;
	private String denumireArbitru;
	private double valoarePremiu;
	
	private static ConcursArcasi concursArcasi = null;

	private ConcursArcasi(int nrArcasi, String denumireArbitru, double valoarePremiu) {
		this.nrArcasi = nrArcasi;
		this.denumireArbitru = denumireArbitru;
		this.valoarePremiu = valoarePremiu;
	}
	
	public static synchronized ConcursArcasi getInstance(int nrArcasi, String denumireArbitru, double valoarePremiu) {
		if(concursArcasi==null) {
			concursArcasi=new ConcursArcasi(nrArcasi,denumireArbitru,valoarePremiu);
		}
		return concursArcasi;
	}

	public void setNrArcasi(int nrArcasi) {
		this.nrArcasi = nrArcasi;
	}

	public void setDenumireArbitru(String denumireArbitru) {
		this.denumireArbitru = denumireArbitru;
	}

	public void setValoarePremiu(double valoarePremiu) {
		this.valoarePremiu = valoarePremiu;
	}

	@Override
	public String toString() {
		return "ConcursArcasi [nrArcasi=" + nrArcasi + ", denumireArbitru=" + denumireArbitru + ", valoarePremiu="
				+ valoarePremiu + "]";
	}
	
}
