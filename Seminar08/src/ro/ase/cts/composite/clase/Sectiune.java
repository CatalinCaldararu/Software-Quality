package ro.ase.cts.composite.clase;
import java.util.ArrayList;
import java.util.List;

public class Sectiune implements ComponentaAbstracta {
private String denumire;
List<ComponentaAbstracta> optiuni;

public Sectiune(String denumire) {
	super();
	this.denumire = denumire;
	optiuni = new ArrayList<>();
}

@Override
public void afiseazaDescriere() {
	System.out.println("Sectiunea "+denumire); 
	for(ComponentaAbstracta optiune:optiuni)
	{
		optiune.afiseazaDescriere();
	}
}
@Override
public void addComponenta(ComponentaAbstracta componentaAbstracta) {
	optiuni.add(componentaAbstracta);
}

@Override
public void stergeComponenta(ComponentaAbstracta componentaAbstracta) {
	optiuni.remove(componentaAbstracta);
	
}
@Override
public ComponentaAbstracta getComponenta(int pozitie) {
	if(pozitie >0 && pozitie < optiuni.size())
	{
		return optiuni.get(pozitie);
	}
	return null;
}

}
