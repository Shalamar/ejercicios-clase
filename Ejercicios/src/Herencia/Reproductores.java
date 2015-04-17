package Herencia;

public class Reproductores extends Dispositivos {

	private int sd;
	private boolean radio;

	public Reproductores(String nombre, int peso, int ancho, int alto,
			int grueso, float precio, int sd, boolean radio) {

		super(nombre, peso, ancho, alto, grueso, precio);
		this.sd = sd;
		this.radio = radio;

	}

	public void getDescripcion() {

		super.getDescripcion();
		System.out.println("- Almacenamiento: " + sd);
		System.out.println("- Radio: " + radio);
	}

}
