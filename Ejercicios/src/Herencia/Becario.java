package Herencia;

public class Becario extends Persona {

	private int departamento;

	public Becario(String nombre, int anyo_alta, int departamento) {

		super(nombre, anyo_alta);
		this.setDepartamento(departamento);

	}

	public int getDepartamento() {
		return departamento;
	}

	public void setDepartamento(int departamento) {
		this.departamento = departamento;
	}

}
