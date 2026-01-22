package interfaces.boton02;

public class Conmutador extends Boton {
	
	private boolean encendido;
	
	@Override
	public void encender() {
		if(!estado) estado = true;
		if(!encendido) encendido = true;
		
	}
	
	@Override
	public void apagar() {
		if(estado) estado = false;
		if(encendido) encendido = false;
	}

}
