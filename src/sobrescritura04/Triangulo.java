package sobrescritura04;

public class Triangulo extends Figura {
	private int base;
	private int altura;
	
	@Override
	public int getArea() {
		return base*altura/2;
	}
	
}
