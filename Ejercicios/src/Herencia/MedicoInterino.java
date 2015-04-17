package Herencia;

public class MedicoInterino extends Medico {

	private String fechaComienzoInterinidad;
	
	public MedicoInterino(String nombre, String apellido, int edad, String fechaComienzoInterinidad) {

		super(nombre, apellido, edad);
		this.setFechaComienzoInterinidad(fechaComienzoInterinidad);
	}

	public String getFechaComienzoInterinidad() {
		return fechaComienzoInterinidad;
	}

	public void setFechaComienzoInterinidad(String fechaComienzoInterinidad) {
		this.fechaComienzoInterinidad = fechaComienzoInterinidad;
	}

	public void mostrarDatos() {

		System.out.println("Nombre: " + getNombre());
		System.out.println("Apellido: " + getApellido());
		System.out.println("Edad: " + getEdad());
		System.out.println("Fecha comienzo: " + getFechaComienzoInterinidad());

	}
}