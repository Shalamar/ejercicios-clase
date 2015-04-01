package Herencia;

import java.sql.Date;

public class Ejemploshere {

	protected String nombre;
	private float salario;
	private int año_alta;
public static final int INICIO_EMPRESA = 1995;

public Ejemploshere(String nombre_,float salario_,int alta){
	
	this.nombre=nombre_;
	this.salario=salario_;
	this.año_alta=alta;

}


public String getNombre() {
	return nombre;
}
public float getSalario() {
	return salario;
}
public int getAño_alta() {
	return año_alta;
}
protected void setAnyoAlta(int alta){
	int anyoActual= 2015;
	if(alta>= INICIO_EMPRESA && alta <= anyoActual)
		this.año_alta =alta;
	else
		this.año_alta = anyoActual;
	
}
public void incSalario(int subida){
	salario=salario+subida;
}

}