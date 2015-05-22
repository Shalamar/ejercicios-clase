package Vehiculos;

public class Coche extends Vehiculo {

	private int cilindrada;

	public Coche(String nombre, String color, String num_serie, int cilindrada) {

		super(nombre, color, num_serie);
		this.cilindrada = cilindrada;

	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public String toString() {

		String info = super.toString() + "\n Cilindrada: " + cilindrada;

		return info;

	}

}
