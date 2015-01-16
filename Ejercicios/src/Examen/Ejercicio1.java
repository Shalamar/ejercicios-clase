package Examen;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int departamento=3;
		int trabajadores;
		int ventas;
		int media;
		int max=0;
		int sumatrabajadores=0;
		int sumaventas=0;
		int min=0;
		int mediaventas=0;
		int mediatrabajador=0;
		
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Datos departamento 1");
		
		
		System.out.println("Numero de trabajadores");
		trabajadores= teclado .nextInt();
		
		System.out.println("Ventas del trabajador 1");
		ventas= teclado .nextInt();
		
		System.out.println("Ventas del trabajador 2");
		ventas= teclado .nextInt();
		
		System.out.println("Datos departamento 2");
		
		
		System.out.println("Numero de trabajadores");
		trabajadores= teclado .nextInt();
		
		System.out.println("Ventas del trabajador 1");
		ventas= teclado .nextInt();
		
		System.out.println("Ventas del trabajador 2");
		ventas= teclado .nextInt();
		
		System.out.println("Datos departamento 3");
		
		
		System.out.println("Numero de trabajadores");
		trabajadores= teclado .nextInt();
		
		System.out.println("Ventas del trabajador 1");
		ventas= teclado .nextInt();
		
		System.out.println("Ventas del trabajador 2");
		ventas= teclado .nextInt();
		
		
		
		
			
		
		sumatrabajadores=sumatrabajadores + trabajadores;
		sumaventas=sumaventas +ventas;
		
		if(sumatrabajadores<max);{
		max=sumatrabajadores;
		}
	
		media=sumaventas /departamento;
		
		mediaventas=media;
		
		if(media>min);{
			min=media;
		}
		mediatrabajador=sumaventas/trabajadores;
		
		System.out.println("Departamento con el menor numero medio de ventas " +media);
		System.out.println("Departamento con mayor trabajadores " + sumatrabajadores);
		System.out.println("Media venta de los trabajadores " +mediatrabajador);
	}
		
		
	}

