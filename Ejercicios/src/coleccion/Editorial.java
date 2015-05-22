package coleccion;

	import java.util.HashMap;
	import java.util.Iterator;

	public class Editorial {

		private HashMap<String, Publicacion> publicaciones;

		public Editorial() {

			publicaciones = new HashMap<String, Publicacion>();

		}

		public void addPublicacion(Publicacion p) {

			publicaciones.put(p.getISBN(), p);
		}

		public void removePublicacion(Publicacion p) {

			publicaciones.remove(p.getISBN());
		}

		public String getInfoPublicacion() {

			String cadena = "";
			for (Iterator<String> it = publicaciones.keySet().iterator(); it
					.hasNext();) {

				String claveHash = it.next();
				Publicacion P = publicaciones.get(claveHash);
				cadena = cadena + P.toString() + "\n";
			}

			return cadena;
		}
}
