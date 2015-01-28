package Clases;

public class Calculadora2 {
double num1;
double num2;
double resultado;

public Calculadora2(double x, double y) {
	num1=x;
	num2=y;
}

public void suma(){
	resultado = num1+num2;
}

public void resta(){
	resultado = num1-num2;
}

public void print(){
	System.out.println("resultado: "+resultado);
}



}
