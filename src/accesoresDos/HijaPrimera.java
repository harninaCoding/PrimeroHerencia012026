package accesoresDos;

import accesoresUno.Primera;

public class HijaPrimera extends Primera {
	// Estan en distintos paquetes pero una es hija de la otra
	public int dos = uno;
//No puede acceder a ella, aunque sea hija porque no est� en el mismo paquete
	int dosdos = aver;
}
