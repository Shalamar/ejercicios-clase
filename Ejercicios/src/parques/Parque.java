package parques;

public class Parque {
	private double KM;
	private String nombre;
	private int numeroEspecies;

	public Parque(double KM, String nombre, int numeroEspecies) {

		this.KM = KM;
		this.nombre = nombre;
		this.numeroEspecies = numeroEspecies;
	}

	public void getInfo() {
		System.out.println("Kilometros: " + KM);
		System.out.println("Nombre: " + nombre);
		System.out.println("Nº Especies: " + numeroEspecies);
	}

	public double getKM() {
		return KM;
	}

	public void setKM(double kM) {
		KM = kM;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroEspecies() {
		return numeroEspecies;
	}

	public void setNumeroEspecies(int numeroEspecies) {
		this.numeroEspecies = numeroEspecies;
	}

	@Override
	public String toString() {
		return "Parque [KM=" + KM + ", nombre=" + nombre + ", numeroEspecies="
				+ numeroEspecies + "]";
	}
}
