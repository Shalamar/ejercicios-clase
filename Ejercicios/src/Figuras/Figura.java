package Figuras;

public abstract class Figura {

	private String color;

	public Figura() {
	}

	public Figura(String color) {

		this.color = color;

	}

	public String getColor() {

		return color;

	}

	public void cambiarColor(String color) {

		this.color = color;

	}

	public abstract void borra();

	public abstract void dibuja();


}
