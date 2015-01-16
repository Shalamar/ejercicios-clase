
import java.util.Scanner;

public class T2ejerciciobucles1 {
	public static void main(String args[]){
		
	int i;
	int n;
	int media;
	int suma=0;
	
	Scanner teclado=new Scanner(System.in);
	
	for(i=0;i<10;i=i+1){
		System.out.println("Introducir num");
		n=teclado.nextInt();
		
		suma=suma+n;	
		System.out.println("suma :" +suma);
	}
	media=suma/10;
	System.out.println("Media :" +media);
	
  }
}