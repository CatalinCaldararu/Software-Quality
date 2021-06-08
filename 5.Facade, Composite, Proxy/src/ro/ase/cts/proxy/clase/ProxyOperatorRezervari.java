package ro.ase.cts.proxy.clase;

public class ProxyOperatorRezervari implements IOperatorRezervari{
	private OperatorRezervari operator;
	private int nrMinimPersoane;
	
	public ProxyOperatorRezervari(OperatorRezervari operator, int nrMinimPersoane) {
		super();
		this.operator = operator;
		this.nrMinimPersoane = nrMinimPersoane;
	}
	
	@Override
	public void realizeazaRezervare(int nrPersoane)
	{
		if(nrPersoane >= nrMinimPersoane)
		{
			operator.realizeazaRezervare(nrPersoane);
		}
		else System.out.println("Va rugam veniti la restaurant fara rezervare");
	}
}
