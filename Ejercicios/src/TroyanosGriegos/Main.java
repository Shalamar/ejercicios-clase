package TroyanosGriegos;

public class Main {
	public static void main(String args []) {

		Troyano Miquel = new Troyano ("Miquel",30,10);
		Griego Borja = new Griego("Borja",21,5);
		
		
		Borja.setHerido(true);
		//Borja.setMuerto(false);
		
		//System.out.println(Borja.isHerido());
		//System.out.println(Borja.isMuerto());
		System.out.println(Borja.retirarse());
		
	}
}
