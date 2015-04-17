package Herencia;

public class Persona {
	private String nombre;
	private int anyo_alta;

	public Persona(String nombre, int anyo_alta) {

		this.nombre = nombre;
		this.anyo_alta = anyo_alta;

	}

	public int getAnyo_alta() {
		return anyo_alta;
	}

	public void setAnyo_alta(int anyo_alta) {
		this.anyo_alta = anyo_alta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
