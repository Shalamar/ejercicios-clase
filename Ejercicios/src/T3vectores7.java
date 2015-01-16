import java.util.Scanner;


public class T3vectores7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]=new int[5];
		int i=0;
		int numenor=0;
		int repite=0;
		
		
		for (i=0;i<5;i++){
			Scanner teclado = new Scanner(System.in);
			System.out.println("Introduzca num");
	        num[i] = teclado.nextInt();
	        
	        if(i==0)
				 numenor=num[0];
			 
			 
		        if(numenor>num[i])
		                numenor=num[i];
		        
		       
			 			
		}
		
		 System.out.println("El num menor es: " +  numenor);
		
		 
		 for (i=0;i<5;i++){
			if(numenor==num[i])
				repite++;
			
			
			if(repite > 1);
				
		}
		 
		System.out.println("El num menor: " +  numenor + " se repite");
			
	}

}
