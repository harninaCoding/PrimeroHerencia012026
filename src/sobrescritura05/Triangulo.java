package sobrescritura05;

public class Triangulo extends Figura {
	private int base;
	private int altura;
	
	
	public Triangulo(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}


	@Override
	public int getArea() {
		return base*altura/2;
	}
	
}
