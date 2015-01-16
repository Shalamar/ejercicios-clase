
import java.util.Scanner;

public class T2ejercicio6 {
	public static void main(String args[]){
		int edad1;
		int edad2;
		int edad3;
		int edad4;
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introducir edades");
		
		System.out.println("Introducir edad1");
		edad1=teclado.nextInt();
		System.out.println("Introducir edad2");
		edad2=teclado.nextInt();
		System.out.println("Introducir edad3");
		edad3=teclado.nextInt();
		System.out.println("Introducir edad4");
		edad4=teclado.nextInt();
		
		if (edad1<edad2 && edad1<edad3 && edad1<edad4){
			
			System.out.println("edad1 es la minima");
		}
		else if  (edad2<edad1 && edad2<edad3 && edad1<edad4){
			
			System.out.println("edad2 es la minima");
		}
		else if (edad3<edad2 && edad3<edad1 && edad3<edad4){
			System.out.println("edad3 es la minima");
		}
		else if (edad4<edad1 && edad4<edad3 && edad4<edad2){
		System.out.println("edad4 es la minima");
	}	
	}
  }


