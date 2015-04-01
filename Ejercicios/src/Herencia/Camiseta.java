package Herencia;

public class Camiseta extends Ropa {
	
	private String mangas;
	private boolean dibujo;
	
	public Camiseta(String c, String f, float p, String t, String m, boolean d){
		super(c,f,p,t);
		this.mangas=m;
		this.dibujo=d;
		
	}
	public Camiseta() {
		this("sin color", "sin fabricante", 0, "sin tejido","sin mangas",false);
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Tipo de manga: " + mangas);
		System.out.println("Tipo de dibujo: " + dibujo);
	}
}
