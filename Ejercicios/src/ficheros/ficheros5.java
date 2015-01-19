package ficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ficheros5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner in = null;
			int contador = 0;
			int suma= 0;
			
			try {
				in = new Scanner(new FileReader("ficheros5.txt"));
				
				do {
					
					String cadena = in.nextLine();
					System.out.println(cadena);
					int num = Integer.valueOf(cadena);
					
					contador++;
					suma = suma + num ;
					
					
				} while(in.hasNextLine());
				
				System.out.println("Hay "+contador+" numeros.");
				System.out.println("SUMA TOTAL: "+suma);
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}


