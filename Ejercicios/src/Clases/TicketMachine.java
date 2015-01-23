package Clases;

public class TicketMachine {
	private int price;
	private int balance;
	private int total;
	
	public TicketMachine(int ticketCost) {
		price = ticketCost;
	}
	
	public int  getPrice(){
		return price;
	}
	
	public int getbalance(){
		return balance;
	}
	
	public void insertMoney(int amount){
		if(amount>0){
			balance = balance + amount;
		}
	}
	
	public void printTicket(){
		if(balance>=price){
			balance=balance-price;
			total=total+price;
			System.out.println("Se ha imprimido su ticket");
			System.out.println("Cantidad a devolver: "+balance);
		}
		else{
			System.out.println("No se puede imprimir el ticket");
			System.out.println("La cantidad que falta es: "+(price-balance));
		}
	}
	
	public int refundBalance(){
		return balance;
		
	}
}
