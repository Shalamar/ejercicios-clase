import java.util.*;

public class T2ejercicio7 {
	

	public static void main(String args[]) {

	long opcion;
	long PatinPedales = 2;
	long PatinMotor = 6;
	long TablaWindsurf = 4;
	long MotoAgua = 7;
	long horas;

	Scanner teclado = new Scanner(System.in);
	System.out.println("Selecciona el tipo de vehiculo");
	System.out.println("Pulsa 1 para patin a pedales 2e/hora ");
	System.out.println("Pulsa 2 para patin a motor 6e/hora");
	System.out.println("Pulsa 3 para tabla de windsurf 4e/hora");
	System.out.println("Pulsa 4 para Moto Acuatica 7e/hora");
	System.out.println("Opcion: ");
	opcion = teclado.nextLong();
	System.out.println("Horas que desea utilizar");
	horas = teclado.nextLong();

	long opcion1 = PatinPedales * horas;
	long opcion2 = PatinMotor * horas;
	long opcion3 = TablaWindsurf * horas;
	long opcion4 = MotoAgua * horas;

	if (opcion == 1) {
	System.out.println("Patin a pedales coste: " + opcion1 + " euros");
	} else if (opcion == 2) {
	System.out.println("Patin a motor coste: " + opcion2 + " euros");
	} else if (opcion == 3) {
	System.out
	.println("Tabla de windsurf coste: " + opcion3 + " euros");
	} else if (opcion == 4) {
	System.out.println("Moto Acuatica coste: " + opcion4 + " euros");
	}
	}
	}
