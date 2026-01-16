package sobrescritura05;


public abstract class Figura {
	//propiedades
	private String color;

	public Figura() {
		super();
		color="gris";
	}

	//Getters & Setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public abstract int getArea();
}
