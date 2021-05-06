package ro.ase.cts.command.clase;

public class ContBancar {
private String detinator;
private float sold;


public ContBancar(String detinator, float sold) {
	super();
	this.detinator = detinator;
	this.sold = sold;
}


public String getDetinator() {
	return detinator;
}


public void setDetinator(String detinator) {
	this.detinator = detinator;
}


public float getSold() {
	return sold;
}


public void setSold(float sold) {
	this.sold = sold;
}


public void constituire(float suma)
{
	this.sold = suma;
	System.out.println("S-a constituit contul pe numele "+this.detinator+" cu suma de "+this.sold);
}

public void retragere(float suma)
{
	if(this.sold >= suma)
	{
		this.sold = this.sold-suma;
		System.out.println("Retragere de suma "+suma);
	}
	else
	{
		System.out.println("Fonduri insuficiente");
	}
}

public void depunere(float suma)
{
	this.sold = this.sold+suma;
	System.out.println("S-a depus suma de "+suma);
}

}
