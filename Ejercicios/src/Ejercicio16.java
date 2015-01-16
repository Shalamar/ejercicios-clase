import java.util.*;
/*
 * @author borica
 * @description Este es el ejercicio 16
 * Tema 1
 */
public class Ejercicio16 {
	public static void main(String args[]){
		double radio;
		double volumen;
		double superficie;
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introducir valores");
		
		System.out.println("Introducir radio");
		radio=teclado.nextDouble();
		
		volumen= 4/3*Math.PI*Math.pow(radio, 3);
		System.out.println("volumen:" +volumen);
		superficie=4*Math.PI*Math.pow(radio, 2);
		System.out.println("superficie:" +superficie);
	}
}
