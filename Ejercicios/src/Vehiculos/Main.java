package Vehiculos;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Registro reg = new Registro();
		
		Coche c1 = new Coche("Toyota", "Azul", "C1", 120);
		Coche c2 = new Coche("Seat", "Rojo", "C2", 90);
		Coche c3 = new Coche("Renoult", "Amarillo", "C3", 120);
		
		Barco b1 = new Barco("Carabela", "Blanco", "B1");
		Barco b2 = new Barco("Ferri", "Verde", "B2");
		
		reg.registrarVehiculo(c1);
		reg.registrarVehiculo(b1);
		reg.registrarVehiculo(c2);
		reg.registrarVehiculo(b2);
		reg.registrarVehiculo(c3);
		
		
		//System.out.println(c1.toString());
		System.out.println(reg.listarVehiculos());
		reg.pintarVehiculo("Negro");
		System.out.println(reg.listarVehiculos());
	}
}
