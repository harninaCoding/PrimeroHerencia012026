package interfaces.teoria01;

public class Persona implements Asegurable {
	private String datosPersonales;
	private String id;
	
	//como se comporta una persona?
	public boolean respira() {
		return true;
	};
	
	public boolean come() {
		return false;
	}

	@Override
	public boolean asegurar() {
		// TODO Auto-generated method stub
		return false;
	}
}
