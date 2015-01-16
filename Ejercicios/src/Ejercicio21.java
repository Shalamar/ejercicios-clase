import java.util.*;
/*
 * @author borica
 * @description Este es el ejercicio 21
 * Tema 1
*/
public class Ejercicio21 {
	public static void main(String args[]){
		int num;
		int par=1;
		int impar=0;
		
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introducir valor");
		
		System.out.println("Introducir num");
		num=teclado.nextInt();
		
		int numero= ((num%2)==0) ? par:impar ;
		
		System.out.println("Resultado: "+numero);
		
		
		
	}
}
