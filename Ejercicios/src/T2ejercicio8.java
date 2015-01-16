import java.util.Scanner;

public class T2ejercicio8 {
	public static void main(String args[]){
		int a;
		int b;
		int c;
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introducir datos");
		
		System.out.println("Introducir A");
		a=teclado.nextInt();
		
		System.out.println("Introducir B");
		b=teclado.nextInt();
		
		System.out.println("Introducir C");
		c=teclado.nextInt();
		
		if (a>b && a>c && b>c )
		{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		}
		
		else if (a>c && a>b &&c>b)
		{
			System.out.println(a);
			System.out.println(c);
			System.out.println(b);
		}
		
		else if (b>c && b>a && c>a)
		{
			System.out.println(b);
			System.out.println(c);
			System.out.println(a);
		}
		else if (b>a && b>c&& a>c)
		{
			System.out.println(b);
			System.out.println(a);
			System.out.println(c);
		}
		else if (c>a && c>b && b>a)
		{
			System.out.println(c);
			System.out.println(b);
			System.out.println(a);
		}
		else if (c>a && c>b && a>b)
		{
			System.out.println(c);
			System.out.println(a);
			System.out.println(b);
		}
	}
}
