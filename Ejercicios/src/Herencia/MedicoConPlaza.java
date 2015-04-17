package Herencia;

public class MedicoConPlaza extends Medico{

	private int identificador;
	
	public MedicoConPlaza(String nombre, String apellido, int edad, int identificador) {
		
		super(nombre, apellido, edad);
		this.setIdentificador(identificador);
		
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	
	public void mostrarDatos() {

		System.out.println("Nombre: " + getNombre());
		System.out.println("Apellido: " + getApellido());
		System.out.println("Edad: " + getEdad());
		System.out.println("Identificador: " + getIdentificador());

	}
}