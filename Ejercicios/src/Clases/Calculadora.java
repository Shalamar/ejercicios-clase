package Clases;

public class Calculadora {
double num1;
double num2;

public Calculadora(double x, double y) {
	num1=x;
	num2=y;
}

public void printsuma(){
	System.out.println("La suma de los numeros es: "+(num1+num2));
}

public void printresta(){
	System.out.println("La resta de los numeros es: "+(num1-num2));
}
public void printmultiplicacion(){
	System.out.println("La multiplicacion de los numeros es: "+(num1*num2));
}
public void printdivision(){
	System.out.println("La division de los numeros es: "+(num1/num2));
}
}
