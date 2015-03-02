package Clases;
import java.text.SimpleDateFormat;
import java.util.*;

public class Prestamo {

	// atributos


	private static int num_prestamos;
	private int id;
	private Libro libro;
	private String fecha_inicio;
	private String fecha_fin;
	private String sancion;
	private String estado;
	// private FechaActual data = new FechaActual();
	private int diaInicio;
	private int mesInicio;
	private int anyoInicio;

	// constructores

	public Prestamo(Libro libro_) {

		id = num_prestamos + 1;
		libro = libro_;

		Calendar calendar = new GregorianCalendar();

		int anyoInicio = calendar.get(Calendar.YEAR);
		int mesInicio = calendar.get(Calendar.MONTH); // Jan = 0, dec = 11
		int diaInicio = calendar.get(Calendar.DAY_OF_MONTH);

		fecha_inicio = diaInicio + " " + this.mesInicio + " " + anyoInicio;
		fecha_fin = diaInicio + " " + (mesInicio + 1) + " " + anyoInicio;
		sancion = "+";
		estado = "activo";

	}

	public Prestamo(int id, String fecha_inicio, String fecha_fin,
			String sancion, String estado, Libro libro_) {

		this.libro = libro_;
		this.id = id;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.sancion = sancion;
		this.estado = estado;

	}

	// metodos

	public int getId() {

		return id;
	}

	public Libro getLibro() {

		return libro;
	}

	public String getFechaInicio() {

		return fecha_inicio;
	}

	public String getFechaFin() {

		return fecha_fin;
	}

	public String getSancion() {

		return sancion;
	}

	public String getEstado() {
		return estado;
	}

	public String toString() {

		String datos = id + " " + libro.toString() + " " + fecha_inicio + " "
				+ fecha_fin + " " + sancion + " " + estado;

		System.out.println("");

		return datos;

	}

	public void ampliarPrestamo(int dias) {

		System.out.println("Fecha fin actual: " + fecha_fin);
		System.out.println("Cuantos dias vas a ampliar el prestamo? ");

		fecha_fin = (diaInicio + dias) + " " + mesInicio + " " + anyoInicio;

		System.out.println("Nueva fecha final: " + fecha_fin);
	}

	public void setEstado() {
		estado = "cerrado";
	}

	public void setSancion() {
		sancion = "-";
	}

	public void setNumPrestamos(int num) {

		num_prestamos = num;

	}
}	
