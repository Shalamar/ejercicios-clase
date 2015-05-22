package Figuras;

public class Recta extends Figura1D{

	
	public Recta(String color,int pIni,int pFin){
		
		super(color,pIni,pFin);
	}
	
	public void borra(){
	
		this.cambiarColor(null);
		this.setPtoIni(0);
		this.setPtoFin(0);
	}
	
	public void dibuja(){
	
		this.cambiarColor(this.getColor());
		this.setPtoIni(this.getPtoIni());
		this.setPtoFin(this.getPtoFin());
		
	}
	

}
