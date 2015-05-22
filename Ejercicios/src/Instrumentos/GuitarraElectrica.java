package Instrumentos;

public class GuitarraElectrica extends InstrumentoDeCuerda {

	public GuitarraElectrica(String nombre, int numeroCuerdas) {
		super(nombre, numeroCuerdas);
	}

	public void tocar() {
	
		System.out.println("La guitarra "+ getNombre()+ " de "+ getNumeroCuerdas()+ " cuerdas esta sonando!");
	}

}
