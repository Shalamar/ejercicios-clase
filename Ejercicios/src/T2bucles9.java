

	import java.util.*;

public class T2bucles9 {

	public static void main(String[] args) {

	Scanner teclado = new Scanner(System.in);

	int edad;

	int suma = 0;

	int i = 0;

	int edadMax = 0;
	int edadMin = 0;

	int contadorJubilados = 0;
	int contadorMenores = 0;

	System.out.println("Introduce una edad.");
	edad = teclado.nextInt();

	while (edad > 0) {
	i++;
	suma = suma + edad;

	if (i == 1) {
	edadMin = edad;
	edadMax = edad;
	}

	if (edad > edadMax) {
	edadMax = edad;
	} 
	if (edad < edadMin) {
	edadMin = edad;
	}

	if (edad > 65) {
	contadorJubilados++;
	}
	if (edad < 18) {
	contadorMenores++;
	}

	System.out.println("Introduce una edad.");
	edad = teclado.nextInt();

	}

	System.out.println("Edad Maxima: " + edadMax);
	System.out.println("Edad Minima: " + edadMin);

	double media = suma / (double) i;
	System.out.println("Media: " + media);

	System.out.println("Hay " +contadorJubilados+ " personas jubiladas.");
	System.out.println("Hay " +contadorMenores+ " personas menores de edad.");


	}// fin clase

	}// fin main

