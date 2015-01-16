import java.util.Scanner;


public class T3vectores3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int claseA[]=new int[5];
		int claseB[]=new int[5];
		int i;
		int sumaA=0;
		int sumaB=0;
		int mediaA=0;
		int mediaB=0;
		
		for(i=0;i<5;i++){
	    	
			Scanner teclado = new Scanner(System.in);
	    	System.out.println("Introduzca notas de la clase A");
	        claseA[i] = teclado.nextInt();
	        sumaA=sumaA+claseA[i];
		}
		for(i=0;i<5;i++){
			Scanner teclado = new Scanner(System.in);
	        System.out.println("Introduzca notas de la clase B");
	        claseB[i] = teclado.nextInt();
	        
	        
	        sumaB=sumaB+claseB[i];
	        
		}
		
		mediaA=sumaA/i;
		mediaB=sumaB/i;
		
		System.out.println("La media de la clase A es:" + mediaA);
		System.out.println("La media de la clase B es:" + mediaB);
		
		if(mediaA>mediaB)
			System.out.println("La media de la clase A es mayor:" + mediaA);
		if(mediaB>mediaA)
			System.out.println("La media de la clase B es mayor:" + mediaB);
	}

}
