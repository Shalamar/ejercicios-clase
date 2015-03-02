package Clases;

public class PruebaBiblio {

	public static void main(String[] args) {
		
			Biblioteca b=new Biblioteca();
			Usuario borja = new Usuario("Borja", "20496160", "C/ valencia 22");
			
			b.altaUsuario(borja);
			
			
			System.out.println("Prestamos Activos: "+ b.getNumPrestamosActivos());
			System.out.println("Prestamos Sancionados: "+ b.getNumPrestamosSanciones());
			
			b.getUsuarios();
			
			System.out.println("ARRAY DE LIBROS");
			b.getLibros();
	
	}

}
