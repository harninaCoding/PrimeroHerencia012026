package interfaces.banda04;

public class Bombo extends Instrumento implements Tocable, Estirable {

	public Bombo(String nombre) {
		super(nombre);
	}

	@Override
	public void estira() {
		System.out.println("El bombo se estira");

	}

	@Override
	public void toca() {
		System.out.println("El bombo esta tocando");

	}

}
