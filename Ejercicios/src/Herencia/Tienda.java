package Herencia;

public class Tienda {
	private int peso;
	private int ancho;
	private int alto;
	private int grueso;
	private float precio;
	

	public Tienda(int p, int an, int al, int g,int pr) {
		
		peso = p;
		ancho = an;
		alto = al;
		grueso = g;
		precio = pr;
	}

	public Tienda() {
		this(0, 0, 0, 0, 0);
	}
	public float getPrecio(){
		return precio;
	}

	public void imprimir() {
		System.out.println("Peso: " + peso);
		System.out.println("Ancho: " + ancho);
		System.out.println("Alto: " + alto);
		System.out.println("Grueso: " + grueso);
		System.out.println("Precio:" + precio);
		
	}
}
