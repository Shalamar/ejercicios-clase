import java.util.Scanner;


public class T3vectores4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vector[]=new int[10];
	    int i=0;
	    
	    for (i=0;i<10;i++){
	    	Scanner teclado = new Scanner(System.in);
	    	System.out.println("Introduzca vector");
	        vector[i] = teclado.nextInt();
	    }
	    
	    i=0;
	    
	 
	    	
	    	
	    	while(i<9 && vector[i] <vector[i+1]){
	    		i++;
	    	}
	
	if(i==9){
		System.out.println("Ordenado");
	}else{
		System.out.println("Desordenado");
	}
	
	
	}

}
