import java.util.*;
/*
 * @author borica
 * @description Este es el ejercicio 15
 * Tema 1
 */
public class Ejercicio15 {
	public static void main(String args[]){
		double L1;
		double L2;
		double L3;
		double SP;
		double resultado;
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introducir valores");
		
		System.out.println("Introducir L1");
		L1=teclado.nextDouble();
		System.out.println("Introducir L2");
		L2=teclado.nextDouble();
		System.out.println("Introducir L3");
		L3=teclado.nextDouble();
		
		
		SP= (L1+L2+L3)/2;
		System.out.println("SP:" +SP);
		resultado=Math.sqrt(SP*(SP-L1)*(SP-L2)*(SP-L3));
		System.out.println("SP*(SP-L1)*(SP-L2)(SP-L3)=" + resultado);
		
		
	}
}
