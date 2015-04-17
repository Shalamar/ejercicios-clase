package Herencia;

public class Camaras extends Dispositivos {

	private static final float descuento = 0.1f;
	private int r_horizontal;
	private int r_vertical;
	private boolean flash;

	public Camaras(String nombre, int peso, int ancho, int alto, int grueso,
			float precio, int r_horizontal, int r_vertical, boolean flash) {

		super(nombre, peso, ancho, alto, grueso, precio);

		this.r_horizontal = r_horizontal;
		this.r_vertical = r_vertical;
		this.flash = flash;

	}

	public float getPrecio() {

		float preDescuento = super.getPrecio()
				- (super.getPrecio() * descuento);

		return preDescuento;
	}

	public void getDescripcion() {

		super.getDescripcion();
		System.out.println("- Resolucion ");
		System.out.println("\t - Horizontal: " + r_horizontal);
		System.out.println("\t - Vertical: " + r_vertical);
		System.out.println("- flash: " + flash);
		System.out.println("- Precio con descuento: " + getPrecio());
	}

}
