package Examen;

import java.util.Scanner;

public class Ejercicio2 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			int num;
			int min=0;
			
			
			Scanner teclado= new Scanner(System.in);
	
			System.out.println("Introduzca numero 1");
			num= teclado .nextInt();
			
			System.out.println("Introduzca numero 2");
			num= teclado .nextInt();
			
			System.out.println("Introduzca numero 3");
			num= teclado .nextInt();
		
			System.out.println("Introduzca numero 4");
			num= teclado .nextInt();
			
			System.out.println("Introduzca numero 5");
			num= teclado .nextInt();
			
	
			int vector[] = new  int[num];
				
				
			if(num>min);{
			min=num;
			}
			
			System.out.println("El valor minimo es: "+min);
			
			System.out.println("El vector es: "+vector[num]);
			
		
			
	}
	

}
