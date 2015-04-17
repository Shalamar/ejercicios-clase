package Herencia;

public class Administrativo extends Empleado {

	private Jefe jefe;

	public Administrativo(String nombre, float salario, int anyo_alta, Jefe j) {

		super(nombre, salario, anyo_alta);
		setJefe(j);
	}

	public Jefe getJefe() {
		return jefe;
	}

	public void setJefe(Jefe jefe) {
		this.jefe = jefe;
	}

	public float getSalario() {

		float nuevoSalario = super.getSalario() + super.getSalario()
				* (jefe.getBonus() * 0.10f);

		return nuevoSalario;
	}

}
