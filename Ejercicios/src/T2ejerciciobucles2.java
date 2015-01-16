import java.util.Scanner;

public class T2ejerciciobucles2 {
	public static void main(String args[]){
		
	int i;
	int n;
	int suma=0;
	int num;
	
	Scanner teclado=new Scanner(System.in);
	
	System.out.println("Introducir la cantidad de numeros a leer");
	n=teclado.nextInt();
		
	for(i=1;i<=n;i=i+1){
		System.out.println("Variable de control i: "+i);
		System.out.println("Introducir num");
		num=teclado.nextInt();
		System.out.println("Valor de suma antes: "+suma);
		
		if(num%2==0){
		suma=suma+num;	
	}
	System.out.println("Valor de la suma despues: "+suma);
	}
	
	}
}