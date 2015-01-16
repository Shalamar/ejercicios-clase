import java.util.Scanner;

public class T2ejerciciobucles5 {
	public static void main(String args[]){
		
		int num=10;
		
		Scanner reader=new Scanner(System.in);
		
		
		do{
			System.out.println("Introducir num");
			num=reader.nextInt();	
		} while (num>=10 && num<=20);
		System.out.println("ERROR");
	}
	}

