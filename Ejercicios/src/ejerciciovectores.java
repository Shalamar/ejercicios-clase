import java.util.*;

public class ejerciciovectores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int lluvia[]=new int[6];
	    int i=0;
	    int suma=0;
	    int media=0;
	   int max=0;
	    Scanner teclado = new Scanner(System.in);
	    
	    for (i = 0; i < 6; i++) {
	    	
	    	System.out.println("Introduzca datos lluvia");
	    	lluvia[i] = teclado.nextInt();
	    	
	    	
	    	suma=suma+lluvia[i];
	    	}
	
	    media=suma/i;
	    System.out.println("Media:" + media);
	
	        i=0;
	        for (i = 0; i < 6; i++) {
	        if(lluvia[i]>=(media*2)){
			System.out.println("El dia " +i+ " Es el doble de la media");
	        }
	}			
	}

}
