package ficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ficheros2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Scanner in = null;
		try {
			in=new Scanner(new FileReader("ficheros2.txt"));
			in.useDelimiter(",");
			do{
				System.out.println(in.next().toLowerCase());
				if(in.hasNext()==false)
			System.exit(0);
			} while (in!=null);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
