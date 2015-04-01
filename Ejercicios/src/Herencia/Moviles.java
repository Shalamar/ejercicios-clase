package Herencia;

public class Moviles extends Tienda{
	
	private String operador;
	private boolean camara;
	
	public Moviles(int p, int an, int al, int g,int pr, String op,boolean ca){
		super(p,an,al,g,pr);
		this.operador=op;
		this.camara=ca;
	}
	
	public Moviles() {
		this(0, 0, 0, 0,0,"sin operadora",false);
	}
	public void imprimir() {
		super.imprimir();
		System.out.println("Operadora: " + operador);
		System.out.println("Tiene camara?: " + camara);
		
		
	}
}
