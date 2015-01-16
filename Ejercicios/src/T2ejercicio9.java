import java.util.Scanner;

public class T2ejercicio9 {
	public static void main(String args[]){
		int precio;
		int unidades;
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introducir datos");
		
		System.out.println("Introducir precio");
		precio=teclado.nextInt();
		
		System.out.println("Introducir unidades");
		unidades=teclado.nextInt();
	
	int preciototal=precio*unidades;
	
	//3x2
	long unidagrup=unidades/3;
	long uninoagrup=unidades%3;
	float precioagrup=(unidagrup*2)*precio;
	float precionoagrup=uninoagrup*precio;
	float pretrespordos=precioagrup+precionoagrup;
	
	//30%
	float destre=(precio*30)/100;
	float resdestres=precio-destre;
	
	//resultado
	
	if(pretrespordos<resdestres){
		System.out.println("Total de la oferta 3x2 "+ pretrespordos);
		System.out.println("Total de la oferta 30% "+ resdestres);
		System.out.println(" ");
		System.out.println("Oferta mas recomendada 3x2");
	}
	else if (pretrespordos>resdestres){
		System.out.println("Total de la oferta 3x2 "+ pretrespordos);
		System.out.println("Total de la oferta 30% "+ resdestres);
		System.out.println(" ");
		System.out.println("Oferta mas recomendada 30%");
	}
	}
}
