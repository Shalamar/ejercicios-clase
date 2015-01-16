
import java.util.*;

public class T3vectores11 {

	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce 10 numeros.");

		int num[] = new int[10];
		int i;
		int z = 0;
		int mas_digitos = 0;
	
		int numero = 0;
		int aux;
		
		
		System.out.println("----------------------------------");
		for (i = 0; i < 10; i++) {

			System.out.print("Num º " + (i + 1) + ": ");
			num[i] = teclado.nextInt();
			
			aux = num[i];
			
			z = 0;
			while (aux > 0) {

				aux = aux / 10;
				z++;
				
			}

			System.out.println("Este num tiene: " + z + " digitos.");
			System.out.println("----------------------------------");

			if (i == 0) {

				mas_digitos = z;
			}

			if (z > mas_digitos) {
				mas_digitos = z;
				numero = num[i];

			}

		}

		System.out.println("El numero: " + numero);
		System.out.println("Tiene: " + mas_digitos);

	}// fin main
}