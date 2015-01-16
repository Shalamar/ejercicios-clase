import java.util.*;

public class Matrices3 {

	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);

		int i;
		int x;

		int matriz[][] = new int[4][2];

		int fila;
		int posicion;
		int caja[][] = new int[1][2];

		
		System.out.println("Introduce numeros: ");
		System.out.println("");
		for (i = 0; i < 4; i++) {

			System.out.println("Fila nº " + i);
			for (x = 0; x < 2; x++) {

				matriz[i][x] = teclado.nextInt();

			} 
		}

		

		for (i = 0; i < 1; i++) {

			for (x = 0; x < 4; x++) {

				System.out.println("Fila nº: " + x + " - |" + matriz[x][0]
						+ " " + matriz[x][1] + "|");

			}
		}

		
		System.out.println("Que fila quieres cambiar? (0-4)");
		fila = teclado.nextInt();

		for (x = 0; x < 2; x++) {

			caja[0][x] = matriz[fila][x];
		}

		System.out.println("Caja: " + caja[0][0] + " " + caja[0][1]);

		

		System.out.println("En que posicion la quieres poner? (0-4)");
		posicion = teclado.nextInt();

		for (x = 0; x < 2; x++) {

			matriz[fila][x] = matriz[posicion][x];
		}
		System.out.println("");

		for (x = 0; x < 2; x++) {

			matriz[posicion][x] = caja[0][x];
		}

		

		System.out.println("La nueva posicion es: ");
		for (i = 0; i < 1; i++) {

			for (x = 0; x < 4; x++) {

				System.out.println("Fila nº: " + x + " - |" + matriz[x][0]
						+ " " + matriz[x][1] + "|");

			}
		}

	}
}