package Instrumentos;

public abstract class InstrumentoDeCuerda extends Instrumento {

	private int numeroCuerdas;
	
	public InstrumentoDeCuerda(String nombre, int numeroCuerdas){
		
		super(nombre);
		this.setNumeroCuerdas(numeroCuerdas);
		
	}

	public int getNumeroCuerdas() {
		return numeroCuerdas;
	}

	public void setNumeroCuerdas(int numeroCuerdas) {
		this.numeroCuerdas = numeroCuerdas;
	}
	


}
