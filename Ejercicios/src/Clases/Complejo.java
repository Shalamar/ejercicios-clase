package Clases;

public class Complejo {
	public double pReal;
	public double pImag;
	
	public void asignar(double x, double y) {
		pReal=x;
		pImag=y;
	};
	public void sumar(Complejo b){
		pReal=pReal + b.pReal;
		pImag=pImag + b.pImag;
	};
	public void imprimir(){
		System.out.println("Suma numero real= "+pReal);
		System.out.println("Suma numero imaginario= "+pImag);
	};
};
