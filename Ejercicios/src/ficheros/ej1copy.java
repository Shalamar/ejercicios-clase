package ficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ej1copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Scanner in = null;
		try {
			in=new Scanner(new FileReader("ej1.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int n;
		double max=0;
		int maxciudad=0;
		int x=0;
		double min=0;
		int minciudad=0;
		int c=0;
		int histogram[] = new int[11];
		int suma_ingresos=0;
		int media_ingresos;
		
		
		
		System.out.println("Introduzca número de ciudades");
		n = teclado.nextInt();
		
		int actuaciones[] = new int[n];
		int ingresos[] = new int[n];
		String ciudades[] = new String[n];
		
		System.out.println("Introduzca info de las ciudades");
		for(int i=0;i<n;i++){
			System.out.println("Nombre de la ciudad");
			ciudades[i] = teclado.next();
			System.out.println("Número de actuaciones");
			actuaciones[i] = teclado.nextInt();
			System.out.println("Ingresos");
			ingresos[i] = teclado.nextInt();
		}
		String ciudad;
		int opcion;
		do{
			System.out.println("Seleccione una de las opciones");
			System.out.println("1.Mostrar Actuaciones");
			System.out.println("2.Recaudacion Máxima");
			System.out.println("3.Recaudacion Mínima");
			System.out.println("4.Histograma de actuaciones");
			System.out.println("5.Ingresos Medios");
			System.out.println("6.Salir");
			
			opcion=teclado.nextInt();
			
			switch(opcion){
			case 1:
				System.out.println("Introduzca  ciudad");
				ciudad= teclado.next();
				boolean encontrado=false;
				int i=0;
				while(!encontrado)
				{if(ciudad.equals(ciudades[i])){
					encontrado=true;
					System.out.println("Número de actuaciones " +actuaciones[i]);
					System.out.println("Ingresos " +ingresos[i]);
					System.out.println("");}
				else{i++;;}
				}
				
				break;
			case 2:
				x=0;
				for(x=0;x<n;x++){
					if(x==0){
						max=ingresos[x];
						
					}
					if(max >ingresos[x]){
						max=ingresos[x];
						maxciudad=x;
					}
				}
				System.out.println("La recaudación máxima ha sido " +max+ " en la siguiente ciudad "+ciudades[maxciudad]);
				System.out.println("");
				
				break;
			case 3:
				x=0;
				for(x=0;x<n;x++){
					if(x==0){
						min=ingresos[x];
						
					}
					if(min <ingresos[x]){
						min=ingresos[x];
						minciudad=x;
					}
				}
				System.out.println("La recaudación minima ha sido " +min+ " en la siguiente ciudad "+ciudades[minciudad]);
				System.out.println("");
				break;
			case 4:
				x = 0;
				c = 0;
				for (x = 0; x < n; x++) {

					histogram[actuaciones[x]]++;

				}

				for (c = 0; c < 11; c++) {

					System.out.print("Con " + c + " actuaciones hay: ");

					for (x = 0; x < histogram[c]; x++) {
						System.out.print("*");

					}

					System.out.println("");

				}

				break;
			case 5:
				for (x = 0; x < n; x++) {

					suma_ingresos = suma_ingresos + ingresos[x];

				}

				System.out.println("Total recaudado: " + suma_ingresos);
				media_ingresos = suma_ingresos / n;
				System.out.println("Media de los ingresos " + media_ingresos);

				x = 0;
				for (x = 0; x < n; x++) {

					if (ingresos[x] > media_ingresos) {

						System.out.println("La ciudad "	+ ciudades[x] + " tiene unos ingresos por encima de la media.");
				break;
			
		
	
					}
					}
				}
		}while(opcion!=6);
		System.out.println("Vuelva pronto");
			}
		}



