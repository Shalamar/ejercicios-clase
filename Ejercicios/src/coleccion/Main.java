package coleccion;


	import java.util.ArrayList;

	public class Main {
		
		public static void main(String args[]) {

			Autor aa = new Autor("Diego", 2008, "20394856S");
			Autor ab = new Autor("David", 2009, "24521763Y");
			
			Autor ac = new Autor("Borja", 2010, "12475632E");
			
			
			Publicacion publi = new Publicacion("Teletabis", 1995, "ISB12");
			Publicacion publi2 = new Publicacion("Los cabeza cono", 2005, "ISB10");
			
			publi.addAutor(aa);
			publi.addAutor(ab);
			
			publi2.addAutor(ac);
			
			//System.out.println(publi.toString());
			
			Editorial bromera = new Editorial();
			
			bromera.addPublicacion(publi);
			bromera.addPublicacion(publi2);
			
			System.out.println(bromera.getInfoPublicacion());
		}
}
