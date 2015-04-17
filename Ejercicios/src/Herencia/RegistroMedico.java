package Herencia;

public class RegistroMedico {
	private Medico[] vector = new Medico[50];
	private int i = 0;

	public RegistroMedico() {

	}

	public void addMedico(Medico medico) {

		vector[i] = medico;
		i++;
	}

	public void listar() {

		for (i = 0; i < vector.length; i++) {

			if (vector[i] != null) {
				vector[i].mostrarDatos();
				System.out.println();
			}
		}
	}
}
