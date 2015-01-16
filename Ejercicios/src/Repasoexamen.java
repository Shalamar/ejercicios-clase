import java.util.*;

public class Repasoexamen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grupopracticas =14;
		int matriculados;
		int asistencia=0;
		int media;
		int min;
		int sesiones = 15;
		int sesioncancelada=0;
		int sumaasistencia=0;
		int j;
		Scanner teclado= new Scanner(System.in);
		
		for(int i =0;1<grupopracticas;i++){
		
			System.out.println("Introduzca los alumnos del grupo" +i);
			matriculados= teclado.nextInt();
		sumaasistencia=0;
		sesioncancelada=0;
		
		for( j=0;j<sesiones;j++){
			System.out.println("Introduzca los alumnos que han asistido" +j);
			asistencia= teclado.nextInt();
			if(j==0){
				min=asistencia;
			}
				if(asistencia<min){
					min=asistencia;
					
				}
			}
		sumaasistencia=sumaasistencia+matriculados;
		}
		
		if(asistencia<(matriculados/2)){
			sesioncancelada++;
		}
		if(sesioncancelada>=10){
			System.out.println("Baja asistencia del grupo");
			j=sesiones;
		}
		}
	if(sesioncancelada<10){
		System.out.println("Asistencia media: "+ (sumaasistencia/(double)sesiones));
		
	}
	}

}
