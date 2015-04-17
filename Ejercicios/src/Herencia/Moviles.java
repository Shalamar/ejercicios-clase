package Herencia;

public class Moviles extends Dispositivos {

	private String operadora;
	private boolean camara;

	public Moviles(String nombre, int peso, int ancho, int alto, int grueso,
			float precio, String operadora, boolean camara) {
		
		super(nombre, peso, ancho, alto, grueso, precio);

		this.operadora = operadora;
		this.camara = camara;
		
	}
	
	public void getDescripcion() {
		
		super.getDescripcion();
		System.out.println("- Operadora: " + operadora);
		System.out.println("- Camara: " + camara);
	}

}
