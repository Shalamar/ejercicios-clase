package Clases;

public class PruebaCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuenta c=new Cuenta(1000,245698,1465871);
	
	
	c.retirar(50);
	c.ingreso(500);
	
	c.print();
	}

}
