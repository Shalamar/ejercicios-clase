import java.util.Scanner;


public class T3vectores6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nombre=new String[5];
		int sueldo[]=new int[5];
		int i=0;
		int sueldomayor=0;
		String nombremayor= null; 
		 
		
		for (i=0;i<5;i++){
			 Scanner teclado = new Scanner(System.in);
	    	System.out.println("Introduzca nombre");
	        nombre[i] = teclado.next();
	        
	    	System.out.println("Introduzca sueldo");
	        sueldo[i] = teclado.nextInt();
		 
	        if(i==0)
			 sueldomayor=sueldo[0];
		 
		 
	        if(sueldomayor<sueldo[i])
	                sueldomayor=sueldo[i];
		 			nombremayor=nombre[i];
		 
		 }
		System.out.println("El nombre con el  mayor sueldo es:"+  nombremayor);
		 System.out.println("El sueldo mayor es:"+  sueldomayor);
		 
	}

}
