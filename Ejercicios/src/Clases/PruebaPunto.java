package Clases;

import java.util.Scanner;

public class PruebaPunto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto p1=new Punto(5, 8);
		Punto p2=new Punto(6, 9);
		
		
		
		System.out.println("El valor de x es: " +p1.getX());
		System.out.println("El valor de y es: " +p1.getY());
		
		p1.printCoordenadas();
		
		System.out.println("El valor de x es: " +p2.getX());
		System.out.println("El valor de y es: " +p2.getY());
		
		p2.printCoordenadas();
	}

}
