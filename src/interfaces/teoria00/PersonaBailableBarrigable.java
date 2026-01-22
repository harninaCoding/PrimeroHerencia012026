package interfaces.teoria00;

public class PersonaBailableBarrigable extends Persona implements Bailable, Barrigable {

	@Override
	public void moverBarriga() {
		System.out.println("moviendo la barriga bailable");
		// TODO Auto-generated method stub

	}

	@Override
	public boolean baila() {
		System.out.println("bailando como barriga");
		return false;
	}

}
