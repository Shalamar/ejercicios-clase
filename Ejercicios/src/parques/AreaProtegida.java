package parques;

public class AreaProtegida extends Parque implements Visitable {

	private String ONG;
	private double subvencion;

	public AreaProtegida(double KM, String nombre, int numeroEspecies,
			String ONG, double subvencion) {

		super(KM, nombre, numeroEspecies);
		this.ONG = ONG;
		this.subvencion = subvencion;

	}

	public void getInfo() {
		super.getInfo();
		System.out.println("ONG: " + ONG);
		System.out.println("Subvencion: " + subvencion);

	}

	public String visitar() {

		return "Visitando área protegida " + getNombre();
	}

	public String getONG() {
		return ONG;
	}

	public void setONG(String oNG) {
		ONG = oNG;
	}

	public double getSubvencion() {
		return subvencion;
	}

	public void setSubvencion(double subvencion) {
		this.subvencion = subvencion;
	}

	@Override
	public String toString() {

		return super.toString() + " AreaProtegida [ONG=" + ONG + ", subvencion="
				+ subvencion + "]";
	}

}
