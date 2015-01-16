import java.util.Scanner;

public class T2bucles {
	public static void main(String args[]){
		
		int i;
		int n;
		
		Scanner reader=new Scanner(System.in);
	System.out.println("Introducir num");
			n=reader.nextInt();
		
		for(i=1;i!=n+1;i=i+1){
			System.out.println(i);
		}
	}
}
