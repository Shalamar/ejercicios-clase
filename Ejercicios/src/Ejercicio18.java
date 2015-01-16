import java.util.*;
/*
 * @author borica
 * @description Este es el ejercicio 18
 * Tema 1
 */
public class Ejercicio18 {
	public static void main(String args[]){
		double CoeA;
		double CoeB;
		double CoeC;
		double discrim;
		double raiz;
		double raiz2;
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introducir valores");
		
		System.out.println("Introducir CoeA");
		CoeA=teclado.nextDouble();
		System.out.println("Introducir CoeB");
		CoeB=teclado.nextDouble();
		System.out.println("Introducir CoeC");
		CoeC=teclado.nextDouble();
		  
		  discrim=Math.sqrt(Math.pow(CoeB, 2)-4*CoeA*CoeC);
	 	  System.out.println("El discriminantees:" +discrim);
	 	
	 	raiz=(-CoeB + Math.sqrt((CoeB*CoeB)-(4*CoeA*CoeC)))/(2*CoeA); 
	 	raiz2=(-CoeB - Math.sqrt((CoeB*CoeB)-(4*CoeA*CoeC)))/(2*CoeA); 
	 	
	 	System.out.println("raiz:" +raiz);
	 	System.out.println("raiz2:" + raiz2);
	}
}
