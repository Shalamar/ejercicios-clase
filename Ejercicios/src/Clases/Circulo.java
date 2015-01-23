package Clases;

public class Circulo {
public double radio;
public void asignarRadio(double valor){
	radio=valor;
}
public double daradio(){
	return radio;
	}
public double longitud(){
	double longitud=2*3.14*radio;
	return(longitud);
}
public double area(){
	double area=3.14*radio*radio;
	return (area);
}
public boolean mayor(Circulo otroCirculo){
	boolean mayor=false;
	if(this.area()>otroCirculo.area()){
		mayor=true;
	}
	return (mayor);
}
}
