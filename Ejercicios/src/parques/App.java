package parques;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AreaProtegida bioparc = new AreaProtegida(100, "bioparc", 60, "ONG",
				10000);

		AreaProtegidaAcuatica albufera = new AreaProtegidaAcuatica(300,
				"Albufera", 50, "ONG", 15000, 3);

		AreaProtegidaTerrestre jBotanico = new AreaProtegidaTerrestre(150,
				"Jardin botanico valencia", 30, "ONG", 160000, "Llano");

		ReservaCaza coto1 = new ReservaCaza(300,
				"Coto privado Montgomery Burns", 20, "Rifle", 600);

		ReservaCaza coto2 = new ReservaCaza(120, "Coto privado algo", 15,
				"Rifle", 1450);

		ArrayList<Parque> parques = new ArrayList<Parque>();

		parques.add(bioparc);
		parques.add(albufera);
		parques.add(jBotanico);
		parques.add(coto1);
		parques.add(coto2);

		for (Parque p : parques) {
			System.out.print(p); // no hace falta poner el metodo toString para
									// que lo use?
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		for (Parque p : parques) {
			if (p instanceof AreaProtegida) {
				System.out.print(((AreaProtegida) p).visitar());
				System.out.println();
			}
		}

	}
}