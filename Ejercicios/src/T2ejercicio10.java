import java.util.Scanner;

public class T2ejercicio10 {
	public static void main(String args[]){
		
		float temp;
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introducir datos");
		
		System.out.println("Introducir temperatura");
		temp=teclado.nextFloat();
		
		if (temp<=0)
		{
			System.out.println("Solida");
		}
		
		else if (temp>=100)
		{
			System.out.println("Gaseosa");
		}
		else if(temp<=99 && temp>0)
		{
			System.out.println("Liquida");
		}
	
	}
	
}
