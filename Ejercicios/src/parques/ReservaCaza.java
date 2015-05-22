package parques;

public class ReservaCaza extends Parque {

	private String arma;
	private double coste;

	public ReservaCaza(double KM, String nombre, int numeroEspecies,
			String arma, double coste) {
		super(KM, nombre, numeroEspecies);
		this.arma = arma;
		this.coste = coste;
	}

	public void getInfo() {
		super.getInfo();
		System.out.println("Arma: " + arma);
		System.out.println("Coste: " + coste);

	}

	public String getArma() {
		return arma;
	}

	public void setArma(String arma) {
		this.arma = arma;
	}

	public double getCoste() {
		return coste;
	}

	public void setCoste(double coste) {
		this.coste = coste;
	}

	@Override
	public String toString() {
		return super.toString() + " ReservaCaza [arma=" + arma + ", coste="
				+ coste + "]";
	}

}
