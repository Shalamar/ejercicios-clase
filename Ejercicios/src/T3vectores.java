import java.util.Scanner;


public class T3vectores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vector[]=new int[8];
	    int i=0;
	    int suma=0;
	    int suma_36=0;
	   
	    for(i=0;i<=8;i++){
	    	Scanner teclado = new Scanner(System.in);
	    	System.out.println("Introduzca numero");
	        vector[i] = teclado.nextInt();
	        suma=suma+vector[i];
	        
	        if(vector[i]>= 36 && vector[i]<=50 ){
	        	suma_36=suma_36+vector[i];
	        }
	    }
	    System.out.println("Valores mayores de 50");
	
	   for(i=0;i<=8;i++){
		  if (vector[i]>=50){
			
		}
	}
	}

}
