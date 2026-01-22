package interfaces.teoria00;

public class Persona {
	private String datosPersonales;
	private String id;
	private boolean respirando=true;
	private boolean comiendo=false;
	
	//como se comporta una persona?
	public boolean respira() {
		return respirando;
	};
	
	public boolean come() {
		return comiendo;
	}
}
