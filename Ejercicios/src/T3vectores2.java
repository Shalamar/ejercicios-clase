import java.util.Scanner;


public class T3vectores2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vector[]=new int[4];
		int vector2[]=new int[4];
		int vector3[]=new int[4];
		int i;
		
		for(i=0;i<4;i++){
	    	Scanner teclado = new Scanner(System.in);
	    	System.out.println("Introduzca numero primer vector");
	        vector[i] = teclado.nextInt();
	        System.out.println("Introduzca numero segundo vector");
	        vector2[i] = teclado.nextInt();
		
	        vector3[i]=vector[i]+vector2[i];
	        System.out.println("La suma de los dos vectores es:" +vector3[i]);
		}
		
	}

}
