import java.util.Scanner;



public class T2ejercicio1 {
	public static void main(String args[]){
		
		int anyo;
		int anyoactu=2014;
	
	
	Scanner teclado=new Scanner(System.in);
	System.out.println("Introducir año");
	anyo=teclado.nextInt();
	
	if (anyo == anyoactu) { 
		System.out.println("Presente");
	} else if  (anyo > anyoactu){
		System.out.println("FUTURO");
	}
	else if (anyo < anyoactu) {
		System.out.println("PASADO");
	}
	
  }
}
