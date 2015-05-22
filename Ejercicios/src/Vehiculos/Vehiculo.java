package Vehiculos;

public class Vehiculo {
	private String nombre;
	private String color;
	private String num_serie;

	public Vehiculo(String nombre, String color, String num_serie) {

		this.nombre = nombre;
		this.color = color;
		this.num_serie = num_serie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getNum_serie() {
		return num_serie;
	}

	public void setNum_serie(String num_serie) {
		this.num_serie = num_serie;
	}

	public String toString() {
		
		String info = "Nombre: " + nombre + "\n Color: " + color
				+ "\n Numero Serie: " + num_serie;
		
		return info;
	}
}
