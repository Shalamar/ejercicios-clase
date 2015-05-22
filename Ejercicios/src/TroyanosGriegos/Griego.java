package TroyanosGriegos;

public class Griego extends Guerrero {

	public Griego() {

	}

	public Griego(String nombre, int edad, int fuerza) {

		super(nombre, edad, fuerza);

	}

	public boolean retirarse() {

		boolean retirarse;

		if (this.isHerido() && !this.isMuerto()) {

			System.out.println("El guerrero: " + this.getNombre()
					+ " esta herido! Se va a retirar.");
			
			retirarse = true;

		} else {

			retirarse = false;

		}

		return retirarse;
	}

}
