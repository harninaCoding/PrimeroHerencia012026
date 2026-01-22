package interfaces.banda04;

public class Guitarra extends Instrumento implements Tocable, Afinable {

	public Guitarra(String nombre) {
		super(nombre);
	}

	@Override
	public void afina() {
		System.out.println("la guitarra se afina");

	}

	@Override
	public void toca() {
		System.out.println("la guitarra toca");

	}

}
