	import java.util.*;
	
public class T2bucles10 {

	public static void main(String[] args) {
		
		int nota;
		int i=0;
		int aprobados=0;
		int suspendidos=0;
		int condicionados=0;
		    
	
	do {
		i++;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el nota. ");
	    nota = teclado.nextInt();
	if (nota<5){
		aprobados++;
	}
	
	if (nota>4){
		suspendidos++;
	}
	if (nota==4){
		condicionados++;
	}
	}while(i!=6);
		System.out.println("Alumnos aprobados: "+aprobados);
	    System.out.println("Alumnos condicionados: "+condicionados);
	    System.out.println("Alumnos suspendidos: "+suspendidos);
	}
}
