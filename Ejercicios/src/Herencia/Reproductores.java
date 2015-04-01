package Herencia;

public class Reproductores extends Tienda{
	
	private int espacio;
	private boolean radio;
	
	public Reproductores(int p, int an, int al, int g,int pr, int e,boolean r){
		super(p,an,al,g,pr);
		this.espacio=e;
		this.radio=r;
	}
	
	public Reproductores() {
		this(0, 0, 0, 0,0,0,false);
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Espacio de almacenamiento: " + espacio);
		System.out.println("Tiene radio?: " + radio);
		
		
	}
}
