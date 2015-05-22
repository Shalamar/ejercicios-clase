package coleccion;

	import java.util.ArrayList;

	public class Publicacion {

		private String titulo;
		private int anyo;
		private ArrayList<Autor> autores;
		private String ISBN;

		public Publicacion(String titulo, int anyo, ArrayList<Autor> autores,
				String ISBN) {

			this.titulo = titulo;
			this.anyo = anyo;
			this.autores = autores;
			this.ISBN = ISBN;

		}
		
		public Publicacion(String titulo, int anyo,	String ISBN) {

			this.titulo = titulo;
			this.anyo = anyo;
			this.ISBN = ISBN;
			
			autores = new ArrayList<Autor>();

		}

		public void addAutor(Autor a) {

			autores.add(a);
		}

		public void removeAutor(Autor a) {

			autores.remove(a);
		}

		public String listarAutor() {

			String cad = "Autores: \n";
			for (Autor aut : autores) {
				
				cad = cad + aut.toString() + "\n";
				
			}
			return cad;
		}

		public String toString() {
			
			String cadena = "";

			cadena = cadena + "TITULO: " + titulo + "\n ANYO: " + anyo
					+ "\n ISBN: " + ISBN + "\n" + listarAutor();

			return cadena;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public int getAnyo() {
			return anyo;
		}

		public void setAnyo(int anyo) {
			this.anyo = anyo;
		}

		public String getISBN() {
			return ISBN;
		}

		public void setISBN(String iSBN) {
			ISBN = iSBN;
		}

}
