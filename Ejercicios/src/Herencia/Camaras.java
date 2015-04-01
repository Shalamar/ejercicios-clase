package Herencia;

public class Camaras extends Tienda {

	private static float desc =0.1f;
	private int horizontal;
	private int vertical;
	private boolean flash;
	
	public Camaras(int p, int an, int al, int g,int pr, int h,int v,boolean f){
		super(p,an,al,g,pr);
		this.horizontal=h;
		this.vertical=v;
		this.flash=f;
	}
	
	public Camaras() {
		this(0, 0, 0, 0,0,0,0,false);
	}
	public float getPrecio(){
		float descuento= super.getPrecio() -(super.getPrecio()*desc);
		return descuento;
		
	}
	public void imprimir() {
		super.imprimir();
		System.out.println("Resolucion: " + horizontal +" "+vertical);
		System.out.println("Tiene flash?: " + flash);
		System.out.println("Precio descuento: " + getPrecio());
		
		
	}
}
