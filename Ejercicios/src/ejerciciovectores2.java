import java.util.*;

public class ejerciciovectores2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int mañana[]=new int[4];
		int tarde[]=new int[4];
		int i=0;
		int turnos=0;
		int sumamañana=0;
		int sumatarde=0;
		
		Scanner teclado = new Scanner(System.in);
		
       	
	    	
	    	System.out.println("Para turno mañana 1 ");
	    	System.out.println("Para turno tarde 2 ");
	        turnos = teclado.nextInt();
	        
	        if (turnos==1){
	        	 
	        	for (i = 0; i < 4; i++) {
	        		System.out.println("Introduzca sueldo de la mañana");
	    	        mañana[i] = teclado.nextInt();
	    	        sumamañana=sumamañana + mañana[i];
	        }
	        	System.out.println("El turno de mañana: " + sumamañana);
	        }
	        if (turnos==2){
	        	 
	        	for (i = 0; i < 4; i++) {
	        		System.out.println("Introduzca sueldo de la tarde");
	    	        tarde[i] = teclado.nextInt();
	    	        sumatarde=sumatarde + tarde[i];
	        }
	        	System.out.println("El turno de tarde: " + sumatarde);
	        }
	
	
	}
	
	}
