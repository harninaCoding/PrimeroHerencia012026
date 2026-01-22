package interfaces.banda04;

import java.util.ArrayList;

public class PruebaBanda {

	public static void main(String[] args) {
		//podemos acceder a todas desde cualquier sitio
		Trompeta trompeta=new Trompeta("trompeta");
		Bombo bombo=new Bombo("bombo");
		Guitarra guitarra=new Guitarra("guitarra");
		// La idea es poder acceder a las caracteristicas de los instrucmentos a traves de
		// sus comportamiento, o bien a traves de la herencia comun
		//Os presento una coleccion dinamica de objetos
		ArrayList<Instrumento> banda=new ArrayList<Instrumento>();
		banda.add(trompeta);
		banda.add(bombo);
		banda.add(guitarra);
		//Cuando se utiliza un objeto como si fuese de una clase antecesora
		//es decir, cuando usais una trompeta, por ejempo, haciendo referncia 
		//a un instrumento. esto se llama upcasting
		for (Instrumento instrumento : banda) {
			instrumento.presentarse();
		}
		ArrayList<Tocable> tocables=new ArrayList<Tocable>();
		tocables.add(trompeta);
		tocables.add(bombo);
		tocables.add(guitarra);
		for (Tocable tocable : tocables) {
			tocable.toca();
		}
		ArrayList<Afinable> afinables=new ArrayList<Afinable>();
		afinables.add(guitarra);
		//arraylist sabe que no puedes agregar un bombo en afinables
//		afinables.add(bombo);
		for (Afinable afinable : afinables) {
			afinable.afina();
		}
	}

}
