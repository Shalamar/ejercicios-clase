package parques;

public class AreaProtegidaTerrestre extends AreaProtegida {
	
	private String terreno;
	
	public AreaProtegidaTerrestre(double KM, String nombre, int numeroEspecies, String ONG, double subvencion, String terreno) {
		
		super(KM, nombre, numeroEspecies, ONG, subvencion);
		this.terreno = terreno;
		
	}
	
	public void getInfo() {
		super.getInfo();
		System.out.println("Tipo de terreno: "+ terreno);

	}

	public String getTerreno() {
		return terreno;
	}

	public void setTerreno(String terreno) {
		this.terreno = terreno;
	}

	@Override
	public String toString() {
		return super.toString() + " FAreaProtegidaTerrestre [terreno=" + terreno + "]";
	}

}
