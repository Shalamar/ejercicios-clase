package ficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class ficheros3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Scanner in = null;
		float num[]= new float[6];
		PrintWriter out=null;
		int n;
			System.out.println("Introduzca números");
			for(n=0;n<5;n++)
			{num[n]=teclado.nextFloat();
			}
		
		try {
			out= new PrintWriter("ficheros3-a.txt");
			for(n=0;n<5;n++){
			out.print(num[n]+ " ");
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(out!=null)
				out.close();
		}
		try {
			out= new PrintWriter("ficheros3-b.txt");
			for(n=0;n<5;n++){
			out.println(num[n]);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(out!=null)
				out.close();
		}
		
	

	}}
