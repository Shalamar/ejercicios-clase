import java.util.Scanner;


public class T2ejercicio3 {
	public static void main(String args[]){
		
		float x;
		float y;
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introducir coordenadas");
		
		System.out.println("Introducir X");
		x=teclado.nextInt();
		
		System.out.println("Introducir Y");
		y=teclado.nextInt();
		
		if (x==0 && y==0) {
			System.out.println("Estas en el origen");
		}
		else if (x<0 && y<0) {
			System.out.println("Estas en el cuadrante Noreste");
		}
		else if (x<0 && y>0) {
			System.out.println("Estas en el cuadrante Sureste");
		}
		else if (x>0 && y>0) {
			System.out.println("Estas en el cuadrante Suroeste");
		}
		else if (x>0 && y<0) {
			System.out.println("Estas en el cuadrante Noroeste");
		}
		else {
			System.out.println("Estas en un eje");
		}
	}
}
