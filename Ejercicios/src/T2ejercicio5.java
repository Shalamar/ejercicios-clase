import java.util.Scanner;


public class T2ejercicio5 {
	public static void main(String args[]){
		double a;
		double b;
		double c;
		
		
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introducir datos");
		
		System.out.println("Introducir A");
		a=teclado.nextInt();
		System.out.println("Introducir B");
		b=teclado.nextInt();
		System.out.println("Introducir C");
		c=teclado.nextInt();
		
		double d = (Math.pow(b,2))-4*a*c;
		double x= (-b +(Math.pow(b,2))-4*a*c)/2*a;
		double x2= (-b -(Math.pow(b,2))-4*a*c)/2*a;
		
		if (a==0) {
			x=(-c/b);
			System.out.println(x);
		}
		else {
			d=(Math.pow(b,2))-4*a*c;
			System.out.println("Este es el discriminante: "+d);
			if (d==0) {
				x=-b/(2*a);
				System.out.println(x);
			
			}else{
				if(d>0){
					x=(-b +(Math.pow(b,2))-4*a*c)/2*a;
					x2=(-b -(Math.pow(b,2))-4*a*c)/2*a;
				}else{
					System.out.println("No existen soluciones reales");
				}
			}	
		}//fin if else principal
	}//main
}//clase
