package Instrumentos;

public abstract class Instrumento {

	private String nombre;

	public Instrumento(String nombre) {
		this.setNombre(nombre);
	}

	public abstract void tocar();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
