import java.util.*;

	public class T2bucles12 {

	public static void main(String args[]) {

	int numero;
	int negativos = 0;
	int i;

	Scanner teclado = new Scanner(System.in);

	System.out.println("Introduce 10 numeros: ");

	for (i = 1; i != 10 + 1; i++) {
	numero = teclado.nextInt();

	if (numero < 0) {
	negativos++;
	}

	}

	System.out.println("Ha introducido " + negativos+ " numeros negativos.");
	}
	}
