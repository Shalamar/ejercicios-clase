import java.util.*;
/*
 * @author borica
 * @description Este es el ejercicio 10
 * Tema 1
 */
public class Ejercicio10 {
	public static void main(String args[]){
		float fahrenheit;
		float resfahrenheit;
        
		
		System.out.println("Introduzca fahrenheit: ");
		Scanner reader = new Scanner(System.in);   
		fahrenheit = reader.nextFloat();
		float celsius=(fahrenheit-32)/1.8f;
        System.out.println("Resultado:"+celsius);
		
	}

}
