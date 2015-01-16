import java.util.*;
/*
 * @author borica
 * @description Este es el ejercicio 12
 * Tema 1
 */
public class Ejercicio12 {
	public static void main(String args[]){
		double num1;
		double num2;
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introducir valores");
		
		System.out.println("Introducir num1");
		num1=teclado.nextDouble();
		System.out.println("Introducir num2");
		num2=teclado.nextDouble();
		
		
		double suma= num1 + num2;
		double resta=num1 - num2;
		double multi= num1 * num2;
		double potencia=num1*num1;
		double raiz= Math.sqrt(num1);
		double raiz2= Math.sqrt(num2);
				
		System.out.println("La suma es:" +suma);
		System.out.println("La resta es:" +resta);
		System.out.println("La multi es:" +multi);
		System.out.println("La potencia es:" +potencia);
		System.out.println("La raiz es:" +raiz);
		System.out.println("LA raiz2 es:" +raiz2);
	}

}
