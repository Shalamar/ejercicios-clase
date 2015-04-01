package Herencia;

import java.sql.Date;

public class Ejemploshere {

	protected String nombre;
	private float salario;
	private int a�o_alta;
public static final int INICIO_EMPRESA = 1995;

public Ejemploshere(String nombre_,float salario_,int alta){
	
	this.nombre=nombre_;
	this.salario=salario_;
	this.a�o_alta=alta;

}


public String getNombre() {
	return nombre;
}
public float getSalario() {
	return salario;
}
public int getA�o_alta() {
	return a�o_alta;
}
protected void setAnyoAlta(int alta){
	int anyoActual= 2015;
	if(alta>= INICIO_EMPRESA && alta <= anyoActual)
		this.a�o_alta =alta;
	else
		this.a�o_alta = anyoActual;
	
}
public void incSalario(int subida){
	salario=salario+subida;
}

}