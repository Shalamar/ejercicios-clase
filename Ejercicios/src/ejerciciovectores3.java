import java.util.Scanner;


public class ejerciciovectores3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre[]=new String[5];
		int edad[]=new int[5];
	    int i=0;
	    
	    Scanner teclado = new Scanner(System.in);
	    
	    for(i=0;i<5;i++){
	    	System.out.println("Introduzca nombre");
	        nombre[i] = teclado.next();
	        System.out.println("Introduzca edad");
	        edad[i] = teclado.nextInt();
	    }
	    for(i=0;i<5;i++){
                 if(edad[i]>=18){
                	 System.out.println(nombre[i]+ "es mayor de edad");
         	        
                 }
	    }
	    
	}

}
