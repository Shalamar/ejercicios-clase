package Herencia;

public class Jefe extends Empleado {

	private float bonus;

	public Jefe(String nombre, float salario, int anyo_alta, float bonus) {

		super(nombre, salario, anyo_alta);
		this.setBonus(bonus);
		
	}

	public float getBonus() {
		return bonus;
	}

	public void setBonus(float bonus) {
		this.bonus = bonus;
	}

	public float getSalario() {

		float nuevoSalario = super.getSalario() + super.getSalario() * bonus;

		return nuevoSalario;
	}

	public String getDescription() {
		return "Soy " + getNombre() + " y gano " + getSalario();
	}
	
	public void setAnyo_alta(int anyo_alta) {
		super.setAnyo_alta(anyo_alta);
	}

}
