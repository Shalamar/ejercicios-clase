import java.util.*;
/*
 * @author borica
 * @description Este es el ejercicio 9
 * Tema 1
 */
public class Ejercicio9 {

	public static void main(String args[]){
		String nombre;
		String direccion;
		int telefono;
    Scanner teclado=new Scanner(System.in);
	System.out.println("Introduzca los siguientes valores");
	System.out.println("nombre:");
	nombre=teclado.nextLine();
	System.out.println("direccion:");
	direccion=teclado.nextLine();
	System.out.println("telefono:");
	telefono=teclado.nextInt();
	
	System.out.println("Nombre es:" +nombre);
	System.out.println("Direccion es:" +direccion);
	System.out.println("Telefono es:" +telefono);
	}
}
