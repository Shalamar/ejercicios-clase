package Clases;

public class Cuenta {
//atributos
long numcuenta;
long dni;
long saldo;
double interes;

//constructores
public Cuenta() {
	numcuenta=0;
	dni=0;
	saldo=0;
	interes=0;
}

public Cuenta(long x, long y,long z) {
	saldo=x;
	dni=y;
	numcuenta=z;
}
//metodos
public void ingreso(long cant) {
	saldo=saldo+cant;
	
}

public void retirar(long cant) {
	if(cant<=saldo){
		saldo=saldo-cant;
	}else{
		System.out.println("No tienes suficiente saldo");
	}
}
public void print() {
	System.out.println("Saldo:"+ saldo);
	System.out.println("DNI:"+ dni);
	System.out.println("Num Cuenta:"+ numcuenta);
	System.out.println("Interes:"+ interes);
}
}
