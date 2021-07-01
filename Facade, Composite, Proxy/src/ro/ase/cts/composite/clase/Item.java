package ro.ase.cts.composite.clase;

public class Item implements ComponentaAbstracta{
private String nume;

public Item(String nume) {
	super();
	this.nume = nume;
}

@Override
public void afiseazaDescriere() {
	System.out.println("Item: "+nume);
}

@Override
public void addComponenta(ComponentaAbstracta componentaAbstracta) throws Exception {
throw new Exception();
}

@Override
public void stergeComponenta(ComponentaAbstracta componentaAbstracta) {
	throw new IllegalArgumentException();
}

@Override
public ComponentaAbstracta getComponenta(int pozitie) {
	throw new IllegalArgumentException();
}

}
