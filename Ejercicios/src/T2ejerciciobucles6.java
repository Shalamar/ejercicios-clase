import java.util.Scanner;

public class T2ejerciciobucles6 {
	public static void main(String args[]){
		
		int opcion;
		
		Scanner reader=new Scanner(System.in);
		
		do{
			System.out.println("1.Extraer dinero");
			System.out.println("2.Ingresar dinero");
			System.out.println("3.Últimos movimientos");
			System.out.println("4.Salir");
			System.out.println("Introducir una opcion");
			opcion=reader.nextInt();	
		} while (opcion<1 || opcion!=4);
		
		
	}
}
