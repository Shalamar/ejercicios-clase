package Figuras;

public abstract class Figura2D extends Figura {

	private String colorRelleno;

	public Figura2D(String color, String colorRelleno) {
		
		super(color);
		this.colorRelleno = colorRelleno;
		
	}

	public String getColorRelleno() {
		
		return colorRelleno;
	}

	public void cambiaColorRelleno(String colorRelleno) {
		
		this.colorRelleno = colorRelleno;
	}


}
