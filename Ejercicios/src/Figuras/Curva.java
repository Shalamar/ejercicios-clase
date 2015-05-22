package Figuras;

public class Curva extends Figura1D {

	private int radio;

	public Curva(String color, int pIni, int pFin, int radio) {

		super(color, pIni, pFin);
		this.radio = radio;

	}

	public void borra() {

		this.cambiarColor(null);
		this.setPtoIni(0);
		this.setPtoFin(0);
		this.setRadio(0);

	}

	public void dibuja() {

		this.cambiarColor(this.getColor());
		this.setPtoIni(this.getPtoIni());
		this.setPtoFin(this.getPtoFin());
		this.setRadio(this.getRadio());
	}

	public int getRadio() {

		return radio;

	}

	public void setRadio(int radio) {

		this.radio = radio;

	}


}
