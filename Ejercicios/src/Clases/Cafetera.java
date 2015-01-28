package Clases;

public class Cafetera {
//atributos
	int capacidadMaxima;
	int cantidadActual;

//constructores
	
	public Cafetera() {
		capacidadMaxima=1000;
		cantidadActual=0;
	}

	public Cafetera(int x)
	{
		capacidadMaxima = x;
		cantidadActual = capacidadMaxima;
	}
	
	public Cafetera(int x, int y)
	{
		cantidadActual=x;
		capacidadMaxima=y;
		
		if(cantidadActual>capacidadMaxima)
			cantidadActual=capacidadMaxima;
	}
	
	//metodos
	
	public void llenar() {
		cantidadActual=capacidadMaxima;
		
	}
	
	public void servir(int x) {
		cantidadActual -= x;
		
	}
	public void vaciar() {
		cantidadActual = 0;
		
	}
	
	public void agregar(int x) {
		cantidadActual += x;
		
	}
	
	public void mostrarEstado(){
		System.out.println("La cafetera tiene: "+cantidadActual);
		
	}
}
