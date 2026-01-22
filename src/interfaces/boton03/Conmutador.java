package interfaces.boton03;

public class Conmutador extends Boton implements Accionable{
	
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
