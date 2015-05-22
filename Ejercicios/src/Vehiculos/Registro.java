package Vehiculos;

public class Registro {
	private static Vehiculo[] vehiculos;

	public Registro() {

		vehiculos = new Vehiculo[10];
	}

	public void registrarVehiculo(Vehiculo vehiculo) {

		boolean registrado = false;
		int i = 0;

		while (!registrado && i <= vehiculos.length) {

			if (vehiculos[i] == null) {

				vehiculos[i] = vehiculo;
				System.out.println("Se ha registrado correctamente. ");
				registrado = true;

			}
			i++;
		}

	}

	public void eliminarVehiculo(Vehiculo vehiculo) {

		boolean eliminado = false;
		int i = 0;

		while (!eliminado && i <= vehiculos.length) {

			if (vehiculos[i] != null
					&& vehiculo.getNum_serie().equals(
							vehiculos[i].getNum_serie())) {

				vehiculos[i] = null;
				eliminado = true;
			}
			i++;

		}
	}

	public Vehiculo getVehiculo(int i) {

		return vehiculos[i];

	}

	public void pintarVehiculo(String color) {

		int i = 0;

		while (i < vehiculos.length) {

			if (vehiculos[i] != null) {
				vehiculos[i].setColor(color);
			}
			i++;

		}

	}
	
	public String listarVehiculos() {
		
		String cadena = "";
		int i = 0;

		while (i < vehiculos.length) {

			if (vehiculos[i] != null) {
				cadena = cadena + vehiculos[i].toString()+ "\n";
			}
			i++;

		}
		return cadena;
	}
}
