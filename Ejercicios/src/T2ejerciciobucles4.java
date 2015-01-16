import java.util.Scanner;

public class T2ejerciciobucles4 {
	
	public static void main(String args[]){
	
		int n;
		int i;
		int num;
		int max=0;
		int min=0;
		
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introducir la cantidad de numeros a leer");
		n=teclado.nextInt();
		
		for(i=1;i<=n;i=i+1){
			
			System.out.println("Introducir num");
			num=teclado.nextInt();
			
			if(i==1){
				max=num;
				min=num;
			}
			
			//maximo
			if(num>max){
				max = num;
				
			}
			
			//minimo
			if(num<min){
				min=num;
				
			}
			
		}
			System.out.println("Valor minimo: " +min);
			System.out.println("Valor maximo: " +max);
			}
}
