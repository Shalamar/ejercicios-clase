package Herencia;

public class Dispositivos {
	private String nombre;
	private int peso;
	private int d_ancho;
	private int d_alto;
	private int d_grueso;
	private float precio;

	public Dispositivos(String nombre, int peso, int ancho, int alto,
			int grueso, float precio) {

		this.nombre = nombre;
		this.peso = peso;
		this.d_ancho = ancho;
		this.d_alto = alto;
		this.d_grueso = grueso;
		this.precio = precio;

	}

	public float getPrecio() {
		return precio;
	}

	public void getDescripcion() {

		System.out.println("Nombre: " + nombre);
		System.out.println("Peso: " + peso);
		System.out.println("Dimensiones ");
		System.out.println("\t Ancho: " + d_ancho);
		System.out.println("\t Alto: " + d_alto);
		System.out.println("\t Grueso: " + d_grueso);
		System.out.println("Precio: " + precio);
	}
}
