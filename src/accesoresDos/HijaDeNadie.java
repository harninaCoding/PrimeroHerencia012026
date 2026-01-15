package accesoresDos;

import accesoresUno.Primera;

public class HijaDeNadie {
	Primera nueva=new Primera();
	//No puede acceder a ella por no ser hija ni estar en el mismo paquete
	int otra=nueva.uno;
	//No se puede acceder a ella por estar en otro paquete
	int otraII=nueva.aver;
}
