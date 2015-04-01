package Herencia;

public class Administracion extends Ejemploshere {

	private jefe madafaka;
	
	public Administracion(String nombre_, float salario_, int alta, jefe madafaka) {
		super(nombre_, salario_, alta);
	
	

	}

	public jefe getMadafaka() {
		return madafaka;
	}

	public void setMadafaka(jefe madafaka) {
		this.madafaka = madafaka;
	}
	}
