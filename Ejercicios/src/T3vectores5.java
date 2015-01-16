import java.util.Scanner;


public class T3vectores5 {

		public static void main(String[] args) {

			Scanner teclado = new Scanner(System.in);

			int i;
			int num;

			System.out.println("Cuantos alumnos hay?");
			num = teclado.nextInt();

			int facultad[] = new int[num];
			int sexo[] = new int[num];
			int trabaja[] = new int[num];
			int sueldo[] = new int[num];

			float suma_hombres = 0;
			float media_hombres = 0;
			float suma_mujeres = 0;
			float media_mujeres = 0;

			float suma_hombres_trabajan = 0;
			float media_hombres_trabajan = 0;
			float suma_sueldos_hombres = 0;
			float media_sueldos_hombres = 0;

			float suma_mujeres_trabajan = 0;
			float media_mujeres_trabajan = 0;
			float suma_sueldos_mujeres = 0;
			float media_sueldos_mujeres = 0;

			float promedio_hombres_trabajan = 0;
			float promedio_mujeres_trabajan = 0;

			for (i = 0; i < num; i++) {

				System.out.println("Alumno");


				System.out.println("Sexo: ");
				System.out.println("1 : Hombre ");
				System.out.println("2 : Mujer ");
				sexo[i] = teclado.nextInt();

				System.out.println("Trabaja? ");
				System.out.println("1 : Si ");
				System.out.println("2 : No ");
				trabaja[i] = teclado.nextInt();

				if (sexo[i] == 1 && trabaja[i] == 1) {
					suma_hombres++;
					suma_hombres_trabajan++;

					System.out.println("Sueldo: ");
					sueldo[i] = teclado.nextInt();

					suma_sueldos_hombres = suma_sueldos_hombres + sueldo[i];
				}

				if (sexo[i] == 2 && trabaja[i] == 1) {
					suma_mujeres++;
					suma_mujeres_trabajan++;

					System.out.println("Sueldo: ");
					sueldo[i] = teclado.nextInt();

					suma_sueldos_mujeres = suma_sueldos_mujeres + sueldo[i];
				}

				if (sexo[i] == 1 && trabaja[i] == 2) {
					suma_hombres++;
				}
				if (sexo[i] == 2 && trabaja[i] == 2) {
					suma_mujeres++;
				}

			}

			if (suma_hombres > 0) {
				media_hombres = (suma_hombres / num) * 100;

			}

			if (suma_mujeres > 0) {
				media_mujeres = (suma_mujeres / num) * 100;

			}

			if (suma_hombres_trabajan > 0) {
				media_sueldos_hombres = suma_sueldos_hombres
						/ suma_hombres_trabajan;

				promedio_hombres_trabajan = (suma_hombres_trabajan / suma_hombres) * 100;

			}

			if (suma_mujeres_trabajan > 0) {
				media_sueldos_mujeres = suma_sueldos_mujeres
						/ suma_mujeres_trabajan;

				promedio_mujeres_trabajan = (suma_mujeres_trabajan / suma_mujeres) * 100;

			}

			System.out.println("En total hay " + num + " alumnos.");
			System.out.println("Hay " + suma_hombres + " hombres y " + suma_mujeres
					+ " mujeres.");
			System.out.println("Promedio hombres: " + media_hombres);
			System.out.println("Promedio mujeres: " + media_mujeres);

			
			System.out.println("Hay " + suma_hombres_trabajan
					+ " hombres que trabajan.");

			System.out.println("Promedio hombres que trabajan: "
					+ promedio_hombres_trabajan);

			System.out.println("Sueldo total: " + suma_sueldos_hombres);
			System.out.println("Media sueldos hombres: " + media_sueldos_hombres);

			
			System.out.println("Hay " + suma_mujeres_trabajan
					+ " mujeres que trabajan.");

			System.out.println("Promedio mujeres que trabajan: "
					+ promedio_mujeres_trabajan);

			System.out.println("Sueldo total: " + suma_sueldos_mujeres);
			System.out.println("Media sueldos mujeres: " + media_sueldos_mujeres);


		}

	}
