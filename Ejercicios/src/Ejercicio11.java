import java.util.*;
/*
 * @author borica
 * @description Este es el ejercicio 11
 * Tema 1
 */
public class Ejercicio11 {
	public static void main(String args[]){
		double C1;
		double C2;
		double resultado;
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("C1x + C2 = 0 Introduzca los siguientes valores");
		System.out.println("Introducir C1");
		C1=teclado.nextDouble();
		System.out.println("Introducir C2");
		C2=teclado.nextDouble();
		resultado= -C2/C1;
		System.out.println("Mostrar resustaldo"+resultado);		
		
	}
}
