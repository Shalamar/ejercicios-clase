import java.util.Scanner;


public class T2ejercicio2 {
	public static void main(String args[]){

		float a;
		float b;
		float c;
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introducir datos");
		
		System.out.println("Introducir A");
		a=teclado.nextInt();
		
		System.out.println("Introducir B");
		b=teclado.nextInt();
		
		System.out.println("Introducir C");
		c=teclado.nextInt();
		
		if (a==b && a==c) {
			System.out.println("Equilatero");
			
		} else if ((a==b && c!=a && c!=b) || (b==c && c!=a && b!=a) 
				|| (c==a && a!=b && c!=b )){
			System.out.println("Isosceles");
			
		}else{
			System.out.println("Escaleno");
		}
			
	}
}
