package Herencia;

import java.util.Scanner;

public class GestorMensajes {

	public static int menu(Scanner teclado) {

		int op = 0;
		do {
			System.out.println("- Hangouts -");
			System.out.println("1.- Enviar SMS");
			System.out.println("2.- Enviar MMS");
			System.out.println("0.- Salir");
			op = teclado.nextInt();
		} while (op >= 2 && op < 0);

		return op;
	}

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		int op;

		do {
			op = menu(tec);

			switch (op) {

			case 1:
				
				System.out.println("Remitente: ");
				String remit = tec.next();
				
				System.out.println("Destinatario: ");
				String dest = tec.next();
				
				System.out.println("Mensaje: ");
				String mensaje = tec.next();
				tec.next();
				
				System.out.println("Numero: ");
				int num = tec.nextInt();
				
				
				
				
				SMS sms = new SMS(remit, dest, num, mensaje);
				
				System.out.println(sms.visualizarMensaje());

				break;

			case 2:

				break;
			}
		} while (op != 0);

	}
}