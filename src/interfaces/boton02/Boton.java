package interfaces.boton02;

public abstract class Boton {

	//es una clase porque tiene propiedades comunes "estado"
	boolean estado;
	
	abstract public void encender();
	abstract public void apagar(); 
}
