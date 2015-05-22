package parques;

public class AreaProtegidaAcuatica extends AreaProtegida {
	
	private int numeroLagos;
	
	public AreaProtegidaAcuatica(double KM, String nombre, int numeroEspecies, String ONG, double subvencion, int numeroLagos) {
		
		super(KM, nombre, numeroEspecies, ONG, subvencion);
		this.numeroLagos = numeroLagos;
	}
	
	public void getInfo() {
		super.getInfo();
		System.out.println("Numero Lagos: "+ numeroLagos);

	}

	public int getNumeroLagos() {
		return numeroLagos;
	}

	public void setNumeroLagos(int numeroLagos) {
		this.numeroLagos = numeroLagos;
	}

	@Override
	public String toString() {
		return super.toString() + " AreaProtegidaAcuatica [numeroLagos=" + numeroLagos + "]";
	}

}
