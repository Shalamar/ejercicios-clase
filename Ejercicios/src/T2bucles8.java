import java.util.*;


public class T2bucles8 {

	public static void main(String[] args) {
	
    char letra;
    char mayuscula;
    
    do{
    	
    	
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce el letra. ");
	letra = teclado.next().charAt(0);
	mayuscula=(char)('A' + (letra-'a'));
	
	System.out.println(mayuscula);
    }while(letra >='a' && mayuscula <= 'z' );
}
}