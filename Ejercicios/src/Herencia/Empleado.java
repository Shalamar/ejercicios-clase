package Herencia;

public class Empleado extends Persona {

	private float salario;

	public static final int INICIO_EMPRESA = 1995;

	public Empleado(String nombre, float salario, int anyo_alta) {

		super(nombre, anyo_alta);
		this.setSalario(salario);

	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public void increSueldo(float increm) {

		salario = salario + increm;

	}

}
