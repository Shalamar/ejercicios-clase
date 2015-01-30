package Clases;

import java.io.FileNotFoundException;
import java.io.FileReader;
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
}
