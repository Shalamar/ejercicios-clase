package Clases;

public class Rectangulo {
//atributos
int x1,y1;
int x2,y2;
int x3,y3;
int x4,y4;
//constructores
public Rectangulo(int valx1,int valy1,int valx2, int valy2, int valx3, int valy3, int valx4, int valy4 ){
	x1=valx1;
	y1=valy1;
	x2=valx2;
	y2=valy2;
	x3=valx3;
	y3=valy3;
	x4=valy4;
}
public Rectangulo(int base, int altura){
	x1=0;
	y1=0;
	x2=base;
	y2=0;
	x3=base;
	y3=altura;
	x4=0;
	y4=altura;
}
//metodos
public void printsuperficie(){
	System.out.println("La superficie del rectangulo es: "+(x3*y3));

}
public void printdesp(int d){
	x1=0+d;
	y1=0+d;
	x2=x2+d;
	y2=0+d;
	x3=x3+d;
	y3=y3+d;
	x4=0+d;
	y4=y4+d;
}

}
