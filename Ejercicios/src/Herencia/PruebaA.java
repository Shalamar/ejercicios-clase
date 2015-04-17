package Herencia;

public class PruebaA {
	
	public static void imprimirTipo(Mamifero m){
		System.out.println(m.tipo());
		}	
	public static void main(String[] args){

	Mamifero elefante = new Mamifero();
	Cetaceo delfin = new Cetaceo();
	imprimirTipo(elefante);
	imprimirTipo(delfin);
	}
}
