import java.util.Scanner;


public class T2ejercicio4 {
	public static void main(String args[]){
		
		char character;
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introducir caracter");
		character=teclado.next().charAt(0);
	
		
		if (character>='a' && character<='z'){
			System.out.println("Es un caracter");
		}
		else if (character>='0' && character<='9'){
			System.out.println("Es un numero");
		}
		else if (character == '.' || character==',' || character==';' || character==';' ){
			System.out.println("Es un signo de puntuacion");
		}
		else {
		System.out.println("El caracter es desconocido");
		}                                                                            
		
	}
}
