package Clases;

public class Complejob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complejo c;
		c=new Complejo();
		
		Complejo c2;
		c2=new Complejo();
		
		c.asignar(15.6,25.3);
		c2.asignar(7.2,5.1);
		
		c.sumar(c2);
		c.imprimir();
	}

}
