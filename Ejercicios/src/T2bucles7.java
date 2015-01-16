import java.util.*;
public class T2bucles7 {

		public static void main(String args[]) {

			int numero;
			int digitos = 0;

			Scanner teclado = new Scanner(System.in);

			System.out.println("Introduce el numero. ");
			numero = teclado.nextInt();

			System.out.println("Cuantos digitos tiene?");
			digitos = teclado.nextInt();

			int i = 0;

			while (numero != 0) {
			numero = numero / 10;
			i++;
			}

			if (digitos == i ) {
			System.out.println("Es correcto.");
			} else {
			System.out.println("Es incorecto.");
			}

			}
			}

