package ro.ase.cts.decorator;

public abstract class DecoratorAbstract implements CardAbstract {
private CardAbstract cardAbstract;

public DecoratorAbstract(CardAbstract cardAbstract) {
	super();
	this.cardAbstract = cardAbstract;
}

@Override
public String getDetinator()
{
	return cardAbstract.getDetinator();
}

@Override
public void realizeazaPlataNormala()
{
	cardAbstract.realizeazaPlataNormala();
}

@Override
public void realizeazaPlataOnline()
{
	cardAbstract.realizeazaPlataOnline();
}

public abstract void realizeazaPlataContactless();

}
