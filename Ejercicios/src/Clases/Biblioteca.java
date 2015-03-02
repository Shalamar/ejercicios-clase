package Clases;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.*;

public class Biblioteca {

	// atributos

	private Usuario[] usuarios;
	private Libro[] libros;

	// constructores

	public Biblioteca() {

		Scanner in = null;
		usuarios = new Usuario[50];
		libros = new Libro[50];
		int ID_MAX = 0;

		try {

			in = new Scanner(new FileReader("infoBiblioteca.txt"));
			in.next();
			ID_MAX = in.nextInt();
			System.out.println("- ID_MAX - : " + ID_MAX);
			in.nextLine();// Libros:
			in.nextLine();// ----------
			// in.nextLine();
			in.useDelimiter(";");

			int i = 0;
			boolean leerlibros = true;

			for (i = 0; in.hasNext() && leerlibros; i++) {

				in.nextLine();
				String titulo = in.next();

				if (titulo.contains("Prestamos:") == false) {

					System.out.println("TITULO: " + titulo);
					String autor = in.next();
					System.out.println("AUTOR: " + autor);
					int anyo = in.nextInt();
					System.out.println("A�O: " + anyo);
					String editorial = in.next();
					System.out.println("EDITORIAL: " + editorial);
					String isbn = in.next();
					System.out.println("ISBN: " + isbn);

					Libro l = new Libro(titulo, autor, anyo, editorial, isbn);
					System.out.println(l.toString());
					libros[i] = l;

				} else {
					leerlibros = false;
				}

			} // for libros

			int j;

			int k;
			for (i = 0; in.hasNext(); i++) {

				System.out.println("- - - - USUARIO - - - -");
				String nombre = in.next();
				System.out.println("NOMBRE: " + nombre);
				String dni = in.next();
				System.out.println("DNI: " + dni);
				String direccion = in.next();
				System.out.println("DIRECCION: " + direccion);
				int num_prestamos = in.nextInt();
				System.out.println("N� PRESTAMOS: " + num_prestamos);

				System.out.println("- - - - USUARIO - - - -");

				Prestamo[] p = new Prestamo[num_prestamos];
				for (j = 0; j < num_prestamos; j++) {
					in.nextLine();
					// System.out.println("Linea prestamo:" + in.toString());
					int id = in.nextInt();
					System.out.println("ID: " + id);
					// Libro libro = ;
					String nomLibro = in.next();
					System.out.println("LIBRO: " + nomLibro);
					String fecha_inicio = in.next();
					System.out.println("FECHA_INICIO: " + fecha_inicio);
					String fecha_fin = in.next();
					System.out.println("FECHA_FIN: " + fecha_fin);
					String sanction = in.next();
					System.out.println("SANCION: " + sanction);
					String estado = in.next();
					System.out.println("ESTADO: " + estado);

					int posicion = 0;
					boolean encontrado = false;
					for (k = 0; k < libros.length && !encontrado; k++) {

						if (libros[k] != null) {

							System.out.println("NOMBRE LIBRO: "
									+ libros[k].getTitulo());

							System.out.println("BUSCANDO LIBRO: " + nomLibro);
						}

						if (libros[k] != null
								&& nomLibro.contains(libros[k].getTitulo())) {

							posicion = k;

							encontrado = true;

						}

					}

					Prestamo pres = new Prestamo(id, fecha_inicio, fecha_fin,
							sanction, estado, libros[posicion]);

					p[j] = pres;

				}

				System.out.println("- - - USUARIOS .toString() - - -");
				Usuario u = new Usuario(nombre, dni, direccion, p);
				usuarios[i] = u;
				System.out.println(u.toString());
				System.out.println("- - - USUARIOS .toString() FIN - - -");

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			in.close();
		}

		// usuarios[0].getPrestamosActivos()[0].setNumPrestamos(ID_MAX);
		
		System.out.println("");
		System.out.println(" - - - FIN CONSTRUCTOR BIBLIOTECA - - - ");
		System.out.println("");
	}

	// metodos

	public void altaUsuario(Usuario usuario_) {

		int i = 0;
		boolean anyadido = false;

		while (!anyadido) {

			// if (usuarios[i] != null) {
			// System.out.println(" Usuario: " + usuarios[i].toString());
			// }

			if (usuarios[i] == null) {

				usuarios[i] = usuario_;

				anyadido = true;

			}
			i++;
		}

	}

	public void bajaUsuario(String dni) {

		int i = 0;

		boolean borrado = false;

		while (!borrado) {

			if (usuarios[i] != null) {
				System.out.println("usuarios[i].getDNI():-" + usuarios[i].getDNI()+ " -");
			}
			if (usuarios[i] != null && usuarios[i].getDNI().equals(dni)) {
				usuarios[i] = null;
				System.out.println("El usuario: " + dni + " ha sido borrado.");
				borrado = true;
			}

			i++;

		}

	}

	public void altaLibro(Libro libro_) {

		int i = 0;

		boolean dadoAlta = false;

		while (!dadoAlta) {

			if (libros[i] == null) {
				libros[i] = libro_;
				System.out.println("El libro: " + libro_.toString()
						+ " ha sido dado de alta.");

				dadoAlta = true;
			}
			i++;
		}

	}

	public int getNumPrestamosActivos() {

		int presAct = 0;
		int i;
		int j;

		for (i = 0; i < usuarios.length; i++) {

			if (usuarios[i] != null) {

				for (j = 0; j < usuarios[i].getPrestamosActivos().length; j++) {

					if (usuarios[i].getPrestamosActivos()[j] != null) {

						presAct++;
					}
				}
			}
		}

		return presAct;
	}

	public int getNumPrestamosSanciones() {

		int presSan = 0;
		int i;
		int j;

		for (i = 0; i < usuarios.length; i++) {

			if (usuarios[i] != null) {

				for (j = 0; j < usuarios[i].getPrestamosSancionados().length; j++) {

					if (usuarios[i].getPrestamosSancionados()[j] != null) {

						presSan++;
					}
				}
			}
		}

		return presSan;

	}

	public Usuario[] getUsuarios() {
		int i = 0;
		for (i = 0; i < usuarios.length && usuarios[i] != null; i++) {
			
			System.out.println(usuarios[i].toString());

		}

		return usuarios;
	}

	public Libro[] getLibros() {

		int i = 0;
		for (i = 0; i < libros.length && libros[i] != null; i++) {

			System.out.println("");
			System.out.println(libros[i].toString());

		}

		return libros;

	}

	public Usuario getUsuario(String dni) {

		int i = 0;

		boolean encontrado = false;
		int usuEncontrado = 0;

		while (!encontrado) {

			if (usuarios[i].getDNI().equals(dni)) {

				usuEncontrado = i;

				encontrado = true;

			}
			i++;
		}

		return usuarios[usuEncontrado];
	}

	public Libro getLibro(String isbn) {

		int i = 0;
		boolean encontrado = false;
		int libEncontrado = 0;

		while (!encontrado) {

			if (libros[i].getIsbn().equals(isbn)) {

				libEncontrado = i;
				encontrado = true;
			}
			i++;
		}

		return libros[libEncontrado];
	}

	public void histograma() {

		int i = 0;
		int histograma[] = new int[10];

		for (i = 0; i < usuarios.length && usuarios[i] != null; i++) {

			histograma[usuarios[i].getNumPrestamos()]++;

			System.out.println("Prestamos: " + usuarios[i].getNumPrestamos());
		}

		int j;

		for (i = 0; i < histograma.length; i++) {

			if (histograma[i] != 0) {
				System.out.print("Con " + i + " prestamos hay: ");
				for (j = 0; j < histograma[i]; j++) {

					System.out.print("| ");
				}

				System.out.println("");
			}
		}

		// return i;

	}

	public void guardar() {
		PrintWriter out = null;

		try {
			out = new PrintWriter("guardarBiblioteca.txt");

			int i = 0;

			out.println("- - - LIRBOS - - -");
			for (i = 0; i < libros.length; i++) {
				if (libros[i] != null) {
					out.println(libros[i].toString());
				}
			}

			out.println("");
			
			out.println("- - - USUARIOS - - -");
			for (i = 0; i < usuarios.length; i++) {
				
				if (usuarios[i] != null) {
					
					out.println(usuarios[i].toString());
				}
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			out.close();
		}

	}
}
