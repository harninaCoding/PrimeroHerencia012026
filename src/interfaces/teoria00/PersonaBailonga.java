package interfaces.teoria00;

public class PersonaBailonga extends Persona implements Bailable {

	@Override
	public boolean baila() {
		System.out.println("estoy bailando");
		return false;
	}

}
