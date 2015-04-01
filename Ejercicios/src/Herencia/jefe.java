package Herencia;

public class jefe extends Ejemploshere {

	
	private float bonificacion;
	
	public jefe(String nombre_, float salario_, int alta, float bonificacion) {
		super(nombre_, salario_, alta);
		this.bonificacion = bonificacion;
	}

	public float getBonificacion() {
		return bonificacion;
	}

	public void setBonificacion(int bonificacion) {
		this.bonificacion = bonificacion;
	}
	public String getDescription(){
		 return "Soy "+ getNombre()+" y gano "+ getSalario();
		 }
	

	public float getSalario(){
		float nuevoSalario = super.getSalario() + super.getSalario()*bonificacion;
		
		return nuevoSalario;
	}
	
	
}
