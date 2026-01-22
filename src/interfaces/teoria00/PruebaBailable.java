package interfaces.teoria00;

public class PruebaBailable {
public static void main(String[] args) {
	Persona persona=new Persona();
	PersonaBailonga bailonga=new PersonaBailonga();
	System.out.println(persona.respira());
	System.out.println(bailonga.respira());
	System.out.println(bailonga.baila());
	//no puede bailar porque no es bailanga
//	System.out.println(persona.baila());
	PersonaBailableBarrigable personaB=new PersonaBailableBarrigable();
	System.out.println(personaB.baila());
	personaB.moverBarriga();
}
}
