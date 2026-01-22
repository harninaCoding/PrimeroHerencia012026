package interfaces.boton02;

public class Regulador extends Boton{
	
	private int intensidad;
	private final int INTENSIDAD_MAX = 4;
	
	
	@Override
	public void encender() {
	if(intensidad<INTENSIDAD_MAX){
		intensidad++;
		if(intensidad==1) estado= true;
				}
				
		
	}

	@Override
	public void apagar() {
		if(intensidad>0){
			intensidad--;
			if(intensidad==0) estado = false;
		}
			
	}
}
