package Clases;

public class Punto {
	public int x;
	public int y;
	
	public Punto (){
		x=0;
		y=0;
	}
	                   
	public Punto (int numX, int numY){
		x=numX;
		y=numY;
	}
	public int  getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public void printCoordenadas(){
		System.out.println("(" +getX()+ ":" +getY()+ ")");
	}
}
