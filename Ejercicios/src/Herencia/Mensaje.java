package Herencia;

public class Mensaje {
	

		private String remit;
		private String dest;
		private int num;

		public Mensaje(String remit, String dest, int num) {

			this.remit = remit;
			this.dest = dest;
			this.num = num;
		}

		public void enviarMensaje(String destino, int numero) {

			System.out.println("Mensaje enviado a " + dest + " (" + num + ")");

		}

		public String visualizarMensaje() {
			String men = "";

			men = men + "NUMERO: " + num + "\n" + "REMITENTE: " + remit + "\n"
					+ "DESTINATARIO: " + dest + "\n";

			return men;
		}
	
}
