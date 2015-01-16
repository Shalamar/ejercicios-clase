import java.util.Scanner;

public class T2ejerciciobucles3 {
	public static void main(String args[]){
		
		int i;
		int n;
		int num;
		
		
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introducir numero");
		num=teclado.nextInt();
		
		for(i=1;i<=10;i=i+1){
			
		System.out.println(num+" x "+ i+ "=" +num*i);
			
			
		}
	}
}
