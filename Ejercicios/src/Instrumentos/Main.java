package Instrumentos;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GuitarraElectrica guitarra = new GuitarraElectrica("Gibson", 6);
		BajoElectrico bajo = new BajoElectrico("Fender", 4);
		
		guitarra.tocar();
		bajo.tocar();
	}

}
