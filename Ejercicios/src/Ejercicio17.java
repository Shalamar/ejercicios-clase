import java.util.*;
/*
 * @author borica
 * @description Este es el ejercicio 17
 * Tema 1
 */
public class Ejercicio17 {
	public static void main(String args[]){
		int num;
		int Semanas;
		int horas;
		int Dias;
		int HorasRest;
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introducir valores");
		
		System.out.println("Introducir num");
		num=teclado.nextInt();
		
		Semanas=num/(24*7);
		horas=num%(24*7);
		Dias=horas/24;
		HorasRest=horas%24;
		
		System.out.println("Semanas:" +Semanas);
		System.out.println("Dias:" +Dias);
		System.out.println("HorasRest:" +HorasRest);
	}
}
