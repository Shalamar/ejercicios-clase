package Herencia;

public class PruebaEmpleados  {
	public static void main(String[] args){

	Ejemploshere e= new Ejemploshere("Juan",1000,2001);
	System.out.println("Empleado: "+ e.getNombre());
		
	jefe j =new jefe ("Pedro",1200,1999,0.5f);
	System.out.println("Jefe: "+ j.getNombre());
	
	
	System.out.println("Salario: "+ j.getSalario());
	System.out.println("Descripcion: " + j.getDescription());
	}
}

