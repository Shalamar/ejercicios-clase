
	import java.util.*;

	public class T2bucles13 {


	public static void main(String args[]) {

	int cant_litros;
	int precio_litros;

	int factura_total = 0;
	int litros_art1 = 0;
	int mayor600 = 0;

	int i;
	Scanner teclado = new Scanner(System.in);
	System.out.println("Introduce 5 facturas.");

	for (i = 1; i != 5 + 1; i++) {

	System.out.println("Codigo de articulo: " + i);

	System.out.println("Cantidad litros: ");
	cant_litros = teclado.nextInt();

	System.out.println("Precio en litros: ");
	precio_litros = teclado.nextInt();

	if (i == 1) {
	litros_art1 = cant_litros;
	}

	factura_total = factura_total + (cant_litros * precio_litros);

	if (factura_total > 600) {
	mayor600++;
	}
	}

	System.out.println("Facturacion total: " + factura_total + " euros");
	System.out.println("Cantidad litros articulo 1: " + litros_art1
	+ " litros");
	System.out.println("Hay " + mayor600
	+ " facturas mayores de 600 euros.");

	}
	}
