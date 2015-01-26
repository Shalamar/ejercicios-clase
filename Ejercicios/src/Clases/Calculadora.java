package Clases;

public class Calculadora {
double num1;
double num2;

public void asignar(double x, double y) {
	num1=x;
	num2=y;
}
public void suma(){
	System.out.println("La suma de los numeros es: "+(num1+num2));
}

public void resta(){
	System.out.println("La resta de los numeros es: "+(num1-num2));
}
public void multiplicacion(){
	System.out.println("La multiplicacion de los numeros es: "+(num1*num2));
}
public void division(){
	System.out.println("La division de los numeros es: "+(num1/num2));
}
}
