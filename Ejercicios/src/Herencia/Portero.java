package Herencia;

public class Portero extends Jugador {

	private int golesRecibidos;
	private int penaltisParados;
	
	public Portero(String n, String d, int p, int g, int a, int r, int recibidos, int parados){
		super(n,d,p,g,a,r);
		this.golesRecibidos=recibidos;
		this.penaltisParados=parados;
		
	}
	public Portero() {
		this("sin nombre", "sin demarcacion", 0, 0, 0, 0,0,0);
	}
	public void imprimir() {
		super.imprimir();
		System.out.println("Goles Recibidos: " + golesRecibidos);
		System.out.println("Penaltis Parados: " + penaltisParados);
	}
}
