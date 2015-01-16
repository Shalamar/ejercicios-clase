import java.util.*;
public class T2bucles11 {
	
	public static void main(String args[]) {

	int numero;
	int sueldo = 0;
	int mayor = 0;
	int i;

	Scanner teclado = new Scanner(System.in);

	System.out.println("Cuantos sueldos vas a introducir?");
	numero = teclado.nextInt();

	System.out.println("Introduce los sueldos: ");

	for (i = 1; i != numero + 1; i++) {

	sueldo = teclado.nextInt();

	if (i == 1) {
	mayor = sueldo;
	}

	else if (sueldo > mayor) {
	mayor = sueldo;
	}

	}
	System.out.println("El sueldo mayor es: " + mayor);
	}
	}
