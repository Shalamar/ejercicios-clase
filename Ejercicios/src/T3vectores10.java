import java.util.Scanner;


public class T3vectores10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]=new int[10];
		int i=0;
		int j=0;
		
		
		for(i=0;i<10;i++){
			Scanner teclado=new Scanner(System.in);
			System.out.println("Introduce numero");
			num[i]=teclado.nextInt();
		}		
		for( i=0;i<10;i++){
			
			for(j=0;j<num[i];j++){
				System.out.print(j+1 + " ");
			}
			System.out.println();
		}
				
	}

}
