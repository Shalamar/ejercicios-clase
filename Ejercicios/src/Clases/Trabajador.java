package Clases;

public class Trabajador {
//atributo
	private String Nombre;
	private String DNI;
	private int Antiguedad;
	private int Salario;
	private String Departamento;
	
//constructores
	public Trabajador(String x,String y,int a,int s,String d){
		Nombre=x;
		DNI=y;
		Antiguedad=a;
		Salario=s;
		Departamento=d;
			
		}
//metodos
	
	public String getNombre() {
	return Nombre;
}
	public String getDNI(){
		return DNI;
		
	}
	public int getAntiguedad() {
		return Antiguedad;
	}
	public int getSalario() {
		return Salario;
	}
	public String getDepartamento() {
		return Departamento;
	}
	public String toString(){
		String datos=Nombre+ " con DNI: "+DNI+".Antiguedad de "+Integer.toString(Antiguedad)+".Departamento: "+Departamento+". Salario: "+Integer.toString(Salario);
		return datos;
	}
}
