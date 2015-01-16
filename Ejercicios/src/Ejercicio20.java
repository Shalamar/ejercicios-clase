import java.util.*;
/*
 * @author borica
 * @description Este es el ejercicio 20
 * Tema 1
*/
public class Ejercicio20 {
	public static void main(String args[]){
		int num;
		double min;
		int seg;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introducir valores");
		
		System.out.println("Introducir num");
		num=teclado.nextInt();
		
		min= num* 525948.766;
		seg= num* 31556926;
		
		System.out.println("Edad en min:" +min);
		System.out.println("Edad en seg:" +seg);
	}
}
