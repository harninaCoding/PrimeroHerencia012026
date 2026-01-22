package interfaces.banda04;

public class Trompeta extends Instrumento implements Tocable,Limpiable{

	public Trompeta(String nombre) {
		super(nombre);
	}

	@Override
	public void limpia() {
		System.out.println("Limpiando la trompeta");
		
	}

	@Override
	public void toca() {
		System.out.println("tocando la trompeta");
		
	}

}
