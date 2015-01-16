import java.util.Scanner;

public class T2bucles5 {
	public static void main(String args[]){
		
		int suma=0;
		int edad;
		int media=0;
		int i=0;
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introducir edad");
		edad=teclado.nextInt();
		
		do{
			i++;
			System.out.println(i);
			suma=suma+edad;
			
			System.out.println("Introducir edad");
			edad=teclado.nextInt();
			
			
		} while(edad>0);
		media=suma/i;
		System.out.println("Media: "+media);
		
	}
}
