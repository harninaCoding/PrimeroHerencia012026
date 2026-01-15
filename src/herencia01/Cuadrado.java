package herencia01;

public class Cuadrado extends Figura {
	private int lado;

	Cuadrado(int l) {
		this.lado = l;
	}

	// Getters & Setters
	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	// metodos propios
	public int getArea() {
		return lado * lado;
	}
}
