package Clases;

import java.io.*;

/**
 * Clase Vuelo: Permite representar un vuelo.
 * 
 */
public class Vuelo {
	// Atributos de instancia

	/* COMPLETAR */
	private String ident;
	private String origen;
	private String destino;
	private String hsalida;
	private String hllegada;

	// Atributos de clase
	/** Numero maximo de reservas (plazas) de cada vuelo. */
	public static final int MAX_PLAZAS = 52;

	private String plazas[] = new String[MAX_PLAZAS + 1];
	private int reservadas = 0;

	/**
	 * Construye un objeto de la clase {@code Vuelo} con identificador
	 * {@code id}, ciudad de origen {@code orig}, ciudad de destino {@code dest}
	 * , hora de salida {@code hsal}, hora de llegada {@code hlleg} y con
	 * {@code 0} plazas reservadas.
	 * 
	 * @param id
	 *            String.
	 * @param orig
	 *            String.
	 * @param dest
	 *            String.
	 * @param hsal
	 *            String.
	 * @param hlleg
	 *            String.
	 */
	public Vuelo(String id, String orig, String dest, String hsal, String hlleg) {
		/* COMPLETAR */

		ident = id;
		origen = orig;
		destino = dest;
		hsalida = hsal;
		hllegada = hlleg;

	}

	/**
	 * Devuelve el identificador {@code ident} del {@code Vuelo}.
	 * 
	 * @return String.
	 */
	public String getIdentificador() {
		return ident;
	}

	/**
	 * Devuelve la ciudad de origen {@code origen} del {@code Vuelo}.
	 * 
	 * @return String.
	 */
	public String getOrigen() {
		return origen;
	}

	/**
	 * Devuelve la ciudad de destino {@code destino} del {@code Vuelo}.
	 * 
	 * @return String.
	 */
	public String getDestino() {
		return destino;
	}

	/**
	 * Devuelve el numero de plazas reservadas {@code reservadas} (o numero
	 * actual de pasajeros) del {@code Vuelo}.
	 * 
	 * @return int.
	 */
	public int getReservadas() {

		return reservadas;
	}

	/**
	 * Comprueba si hay plazas libres en el {@code Vuelo}.
	 * 
	 * @return boolean.
	 */
	public boolean hayPlazas() {

		boolean hayPlazas = true;

		if (reservadas == MAX_PLAZAS) {
			hayPlazas = false;
		}

		return hayPlazas /* COMPLETAR */;
	}

	/**
	 * Dado un tipo de plaza {@code pref} (pasillo {@code 'P'} o ventanilla
	 * {@code 'V'}), devuelve la primer plaza libre (de numero menor) que
	 * encuentre de ese tipo. O devuelve {@code -1} si no quedan plazas libres
	 * de tipo {@code pref}.
	 * 
	 * @param pref
	 *            char.
	 * @return int.
	 */
	public int primeraLibre(char pref) {

		/* COMPLETAR */

		char tipo = pref;
		int i;
		int plazaEncon = -1;
		boolean encon = false;

		// asientos de ventanilla
		if (tipo == 'V') {

			for (i = 1; i < plazas.length && !encon; i = i + 2) {
				if (plazas[i] == null) {
					plazaEncon = i;
					encon = true;
				}
			}
			// System.out.println("1er libre Ventanilla: " + plazaEncon);
		}
		// asientos pasillo
		if (tipo == 'P') {

			for (i = 2; i < plazas.length && !encon; i = i + 2) {

				if (plazas[i] == null) {
					plazaEncon = i;
					encon = true;
				}

			}

			// System.out.println("1er libre Pasillo: " + plazaEncon);
		}

		return plazaEncon;

	}// de primeraLibre

	/**
	 * Dado un pasajero {@code pas} y un numero de plaza {@code numP}, reserva
	 * dicha plaza para dicho pasajero.
	 * 
	 * @param pas
	 *            String.
	 * @param numP
	 *            int.
	 */
	public void reservar(String pas, int numP) {
		/*
		 * No hace ningun tipo de validacion de datos puesto que este metodo se
		 * invoca en la lectura de datos desde fichero (metodo cargar de la
		 * clase Aerolinea) y los datos se suponen correctos
		 */
		plazas[numP] = pas;
		reservadas++;
	} // de reservar

	/**
	 * Dado un pasajero {@code pas} y un tipo de plaza {@code pref}, si el vuelo
	 * no esta completo, se reserva al pasajero {@code pas} la primera plaza
	 * libre en {@code pref}. El caracter {@cope pref} es `P' o `V' en funcion
	 * de que el pasajero desee una plaza de pasillo o de ventanilla. En caso de
	 * que no quede ninguna plaza libre en la preferencia indicada {@code pref},
	 * se reserva la primera plaza libre de la otra preferencia. Devuelve un
	 * {@code String} indicando que plaza se ha reservado. Por ejemplo, si se ha
	 * solicitado una plaza de una preferencia con plazas libres, devuelve:
	 * "Su reserva:"
	 * "Pepe Garcia   22P  DL101     Valencia        Paris    10:30    16:45"
	 * 
	 * Si no quedan plazas libres en la preferencia solicitada, devuelve:
	 * "No quedan plazas libres en ventanilla"
	 * 
	 * "Su reserva:"
	 * "Pepe Garcia   22P  DL101     Valencia        Paris    10:30    16:45"
	 * 
	 * Si el vuelo ya esta completo, no se puede realizar la reserva y devuelve
	 * el {@code String}: "Imposible realizar la reserva: vuelo completo"
	 * 
	 * @param pas
	 *            String.
	 * @param pref
	 *            char.
	 * @return String.
	 */
	public String reservar(String pas, char pref) {
		String str = "";

		/* COMPLETAR */

		if (hayPlazas() == true) {

			if (pref == 'V') {

				int libre = primeraLibre('V');

				if (libre == -1) {

					libre = primeraLibre('P');

					str = "No quedan plazas libres en ventanilla \n Su reserva: \n "
							+ pas
							+ " "
							+ libre
							+ "P "
							+ ident
							+ " "
							+ origen
							+ " " + destino + " " + hsalida + " " + hllegada;

					plazas[libre] = pas;
					reservadas++;

				} else {

					str = "Su reserva es: \n " + pas + " " + libre + "V "
							+ ident + " " + origen + " " + destino + " "
							+ hsalida + " " + hllegada;

					plazas[libre] = pas;
					reservadas++;

				}

			}

			if (pref == 'P') {

				int libre = primeraLibre('P');

				if (libre == -1) {

					libre = primeraLibre('V');

					str = "No quedan plazas libres en pasillo \n Su reserva: \n"
							+ pas
							+ " "
							+ libre
							+ "V "
							+ ident
							+ " "
							+ origen
							+ " " + destino + " " + hsalida + " " + hllegada;

					plazas[libre] = pas;
					reservadas++;

				} else {

					str = "Su reserva es: \n " + pas + " " + libre + "P "
							+ ident + " " + origen + " " + destino + " "
							+ hsalida + " " + hllegada;

					plazas[libre] = pas;
					reservadas++;

				}
			}
		} else {

			str = "Imposible realizar la reserva: vuelo completo";
		}

		return str;
	}// de reservar

	/**
	 * Dado un numero de plaza valida {@code numP} ({@code 1<=numP<=MAX_PLAZAS}
	 * ), si esta ocupada, se cancela la reserva de dicha plaza y devuelve el
	 * {@code String}: "Reserva cancelada" En caso contrario, la cancelacion no
	 * es posible y devuelve el {@code String}:
	 * "Imposible realizar la cancelacion: la plaza " numP " no esta ocupada"
	 * 
	 * @param numP
	 *            int.
	 * @return String.
	 */
	public String cancelar(int numP) {
		String str = "";

		/* COMPLETAR */

		if (plazas[numP] == null) {
			str = "Imposible realizar la cancelacion: la plaza numP no esta ocupada";

		} else {

			plazas[numP] = null;
			str = "Reserva cancelada";

		}

		return str;
	} // de cancelar

	/**
	 * Devuelve un {@code String} con los datos del vuelo (el identificador, la
	 * ciudad de origen, la ciudad de destino, la hora de salida y la hora de
	 * llegada).
	 * 
	 * @return String.
	 */
	public String toString() {
		String str = "";
		str = str
				+ str.format("%8s %12s %12s %8s %8s", ident, origen, destino,
						hsalida, hllegada);
		return str;
	} // de toString

	/**
	 * Devuelve un {@code String} con los datos del vuelo y el listado de
	 * reservas del mismo. Se utiliza el siguiente formato (ejemplo): IB101
	 * Valencia Paris 10:30 16:45 Luisa Millar (1V) Paco Gomez (2P) Marta Lopez
	 * (3V)
	 * 
	 * @return String.
	 */
	public String listarReservas() {
		String str = "\n" + toString() + "\n";

		/* COMPLETAR */
		int i;
		for (i = 1; i < plazas.length; i++) {

			if (i % 2 == 0) {
				str = str + plazas[i] + " (" + i + "P) " + "\n";
			} else {
				str = str + plazas[i] + " (" + i + "V) " + "\n";
			}
		}
		return str;
	} // de listarReservas

	/**
	 * Escribe en {@code fich} toda la informacion del {@code Vuelo}.
	 * 
	 * @param fich
	 *            PrintWriter.
	 */
	public void guardar(PrintWriter fich) throws Exception {
		/* Se invoca desde el metodo guardar de la clase Aerolinea */
		fich.println(ident + " " + origen + " " + destino + " " + hsalida + " "
				+ hllegada);
		fich.println(reservadas);
		for (int i = 1; i <= MAX_PLAZAS; i++)
			if (plazas[i] != null)
				fich.println(i + " " + plazas[i]);
	} // de guardar

} // de Vuelo