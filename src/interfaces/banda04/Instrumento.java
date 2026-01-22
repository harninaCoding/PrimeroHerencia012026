package interfaces.banda04;

public abstract class Instrumento {
	private String nombre;
	
	public Instrumento(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public void presentarse() {
		System.out.println("soy el instrumento "+nombre);
	}
}
