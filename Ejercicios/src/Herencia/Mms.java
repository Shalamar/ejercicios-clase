package Herencia;

public class Mms extends Mensaje {
	
	private String nom_foto;

	public Mms(String remit, String dest, int num, String nom_foto) {
		super(remit, dest, num);
		
		this.nom_foto = nom_foto;
	}

	public void enviarMensaje(String destino, int numero, String foto) {

		System.out.println("Nombre foto: "+ nom_foto);
		super.enviarMensaje(destino, numero);

	}
	
	public String visualizarMensaje() {

		String men = super.visualizarMensaje();

		men = men + "Nombre foto: " + nom_foto;
		
		return men;
	}
}