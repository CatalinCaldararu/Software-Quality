package ro.ase.cts.prototype;

public class Program {

	public static void main(String[] args) {
		Reteta reteta1 = new Reteta("Apa oxigenata",50);
		Reteta reteta2 = (Reteta)reteta1.copiaza();
		System.out.println(reteta1);
		System.out.println(reteta2);
	}
}
