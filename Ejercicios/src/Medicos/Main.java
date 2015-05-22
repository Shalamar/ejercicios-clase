package Medicos;

public class Main {
public static void main(String[] args) {
		
		RegistrosMedicos registro = new RegistrosMedicos();
		
		MedicoInterino borja = new MedicoInterino("Borja", "Ribes", 30, "15 - 10 - 2015");
		MedicoConPlaza pepe = new MedicoConPlaza("Pepe", "Ortíz", 34, 1);
		
		registro.addMedico(borja);
		registro.addMedico(pepe);
		registro.listar();

	}
}
