package Herencia;

	public class SMS extends Mensaje {

		private String mensaje;

		public SMS(String remit, String dest, int num, String mensaje) {
			super(remit, dest, num);
			this.mensaje = mensaje;
		}

		public String visualizarMensaje() {

			String men = super.visualizarMensaje();

			men = men + "MENSAJE: " + mensaje;
			
			return men;
		}
}
