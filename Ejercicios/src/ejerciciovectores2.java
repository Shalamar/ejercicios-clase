import java.util.*;

public class ejerciciovectores2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int ma�ana[]=new int[4];
		int tarde[]=new int[4];
		int i=0;
		int turnos=0;
		int sumama�ana=0;
		int sumatarde=0;
		
		Scanner teclado = new Scanner(System.in);
		
       	
	    	
	    	System.out.println("Para turno ma�ana 1 ");
	    	System.out.println("Para turno tarde 2 ");
	        turnos = teclado.nextInt();
	        
	        if (turnos==1){
	        	 
	        	for (i = 0; i < 4; i++) {
	        		System.out.println("Introduzca sueldo de la ma�ana");
	    	        ma�ana[i] = teclado.nextInt();
	    	        sumama�ana=sumama�ana + ma�ana[i];
	        }
	        	System.out.println("El turno de ma�ana: " + sumama�ana);
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
