package Herencia;

import java.util.Scanner;

public class GestorTienda {
	public static int menu(Scanner teclado) {
		int opcion = 0;		
		
		do {
			System.out.println(" - ARTICULOS - ");
			System.out.println("1.- Camaras.");
			System.out.println("2.- Moviles.");
			System.out.println("3.- Reproductores.");
			System.out.println("0.- Salir.");
			System.out.print("\n Elige: ");
			opcion = teclado.nextInt();
			
		} while (opcion >=3 && opcion < 0);
		
		
		return opcion;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tec = new Scanner (System.in);
		
		Camaras cam = new Camaras("Nikon", 200, 10, 5, 1, 200, 1080, 720, true);
		Moviles mov = new Moviles("OnePlus one", 160, 7, 16, 1, 300, "Libre", true);
		Reproductores rep = new Reproductores("Suntech", 100, 3, 2, 1, 20, 4, true);
		
		int opc = 0;
		
		do {
			System.out.println("");
			opc = menu(tec);
			
			switch (opc) {
			case 1:

				cam.getDescripcion();				
				System.out.println(cam.getPrecio());
				
				break;
				
			case 2:

				mov.getDescripcion();
				System.out.println(mov.getPrecio());
				
				break;
				
			case 3: 
				
				rep.getDescripcion();
				System.out.println(rep.getPrecio());
				
				break;
			
			}
			
		} while (opc != 0);
	}
}
