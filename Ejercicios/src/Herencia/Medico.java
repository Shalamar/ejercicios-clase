package Herencia;

public class Medico {

	private String nombre;
	private String apellido;
	private int edad;

	public Medico(String nombre, String apellido, int edad) {

		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setEdad(edad);

	}

	public void mostrarDatos() {

		System.out.println("Nombre: " + getNombre());
		System.out.println("Apellido: " + getApellido());
		System.out.println("Edad: " + getEdad());

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
