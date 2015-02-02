package Clases;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Empresa {
	//atributos
	private String nombre;
	private int antiguedadEmpresa;
	private int maxTrabajadores;
	private int numTrabajadores;
	private Trabajador[] trabajadores;
	
	//constructores
	public Empresa(){
		int numTra=0;
		int i =0;
		Scanner in=null;
		try{
			in=new Scanner(new FileReader("TrabajadoresEmpresa.txt"));
			while (in.hasNext()){
				String Nombre =in.next();
				String DNI =in.next();
				int Antiguedad =in.nextInt();
				int Salario =in.nextInt();
				String Departamento =in.next();
				Trabajador t=new Trabajador(Nombre,DNI,Antiguedad,Salario,Departamento);
				trabajadores[i]=t;
			}
		}catch (FileNotFoundException e){
			e.printStackTrace();
		} finally {
			in.close();
		}
	}
	
	//metodos
	public int getNumMaximoTrabajadores(){
		return maxTrabajadores;
	}
	public int getNumTrabajadores(){
		return numTrabajadores;
	}
	public String getNombreEmpresa(){
		return nombre;
	}
	public void anyadirEmpleado(Trabajador e){
		boolean existe=existeEmpleado(e.getDNI());
		System.out.println("Comprobar existencia:" +existe);
		if(!existe){
			boolean insertado=false;
			for(int i =0;i< maxTrabajadores&& !insertado;i++){
				if(trabajadores[i]==null){
					trabajadores[numTrabajadores]=e;
					numTrabajadores++;
					System.out.println("Num Trabajadores tras añadir empleado:" +numTrabajadores);
					insertado=true;
				}
			}
		}
	}
	public String cancelarEmp(String numDNI){
		boolean existe=existeEmpleado(numDNI);
		int i =0;
		String cancelado="Imposible realizar la cancelacion: el DNI" +numDNI+ "no existe";
		if(existe){
			while(i!=maxTrabajadores){
				if(trabajadores[i].getDNI().equals(numDNI)){
					trabajadores[i]=null;
					cancelado="Empleado borrado del sistema";
				}
				i++;
			}
		}
		return (cancelado);
	}
	public boolean existeEmpleado(String numDNI){
		int i=0;
		boolean encontrado=false;
		while(i<numTrabajadores && !encontrado){
			if(numDNI.equals(trabajadores[i].getDNI())){
				encontrado=true;
			}
			i++;
		}
		return encontrado;
		
	}
	public int getIdEmpleado(String numDNI){
		int i;
		int IdTrabajador=0;
		boolean existe=false;
		for(i=0;i<maxTrabajadores && !existe;i++){
			if(numDNI.equals(trabajadores[i].getDNI())){
				IdTrabajador=1;
				existe=true;
			}
		}
		return IdTrabajador;
	}
	public String getInfoEmpleado(String numDNI){
		int i=0;
		int posicion=getIdEmpleado(numDNI);
		boolean existe=false;
		String datos=null;
		while(existe){
			if(i==posicion){
				datos=trabajadores[i].getNombre()+ " "
						+trabajadores[i].getDNI()+ " "
						+trabajadores[i].getAntiguedad()+ " "
						+trabajadores[i].getSalario()+ " "
						+trabajadores[i].getDepartamento()+ " ";
				existe=true;
			}
			i++;
		}
		return datos;
	}
	public String listarEmpleados(){
		int i;
		String datos=null;
		for(i=0;i<maxTrabajadores;i++){
			datos=trabajadores[i].getNombre()+ " "
					+trabajadores[i].getDNI()+ " "
					+trabajadores[i].getAntiguedad()+ " "
					+trabajadores[i].getSalario()+ " "
					+trabajadores[i].getDepartamento()+ " ";
		}
		return datos;
	}
	public void guardar(PrintWriter out){
		out=null;
		int i =0;
		try{
			out=new PrintWriter("datosEmpleados.txt");
			for(i=0;i<maxTrabajadores;i++){
				out.println(trabajadores[i].getNombre()+ " "
						+trabajadores[i].getDNI()+ " "
						+trabajadores[i].getAntiguedad()+ " "
						+trabajadores[i].getSalario()+ " "
						+trabajadores[i].getDepartamento());
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}finally{
			out.close();
		}
	}
	public void toHistograma() {

		int histograma[] = new int[antiguedadEmpresa + 1];
		int i;

		int j;

		for (i = 0; i < maxTrabajadores; i++) {

			histograma[trabajadores[i].getAntiguedad()]++;

		}

		for (i = 0; i < antiguedadEmpresa + 1; i++) {

			System.out.print("Con " + i + " año de antiguedad: ");

			for (j = 0; j < histograma[i]; j++) {

				System.out.print(" * ");
			}
			System.out.println("");

		}

	}
}
