package Clases;

import java.util.Scanner;

public class pruebaTickerMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int precioTicket=10;
		TicketMachine miMaquina=new TicketMachine(50);
		System.out.println("El precio del ticket es: " +miMaquina.getPrice());
		System.out.println("El balance es: " +miMaquina.getbalance());
		System.out.println("Introduce una moneda:");
		Scanner teclado=new Scanner(System.in);
		int moneda=teclado.nextInt();
		miMaquina.insertMoney(moneda);
		System.out.println("El balance es: " +miMaquina.getbalance());
		miMaquina.printTicket();
	}

}
