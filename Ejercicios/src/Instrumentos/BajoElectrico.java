package Instrumentos;

public class BajoElectrico extends InstrumentoDeCuerda{
	
	public BajoElectrico(String nombre, int numeroCuerdas) {
		super(nombre, numeroCuerdas);
	}
	
	public void tocar() {
		
		System.out.println("El bajo "+ getNombre()+ " de "+ getNumeroCuerdas()+ " cuerdas esta sonando!");
	}


}
