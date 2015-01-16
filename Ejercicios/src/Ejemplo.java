import java.util.Scanner;


public class Ejemplo {
	public static void main (String args[]){ 
		int num;
		
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introducir nota");
		num=teclado.nextInt();
		
		
		if (num >= 5) { 
			System.out.println("Esta aprobado");
		} else{
			System.out.println("Esta Suspendido");
		}//fin ifelse
	}//fin main
}//fin clase
