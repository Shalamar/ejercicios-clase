package ficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ficheros3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Scanner in = null;
		float num[]= new float[6];
		int n;
			System.out.println("Introduzca números");
			for(n=0;n<5;n++)
			{num[n]=reader.nextFloat();
			}
		
		try {
			
			
			
			in=new Scanner(new FileReader("ficheros3.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
