package sobrescritura05;


class Testfiguras {
public static void main(String[] args) {
	Cuadrado c=new Cuadrado(5);
	c.setColor("rosa");
	Triangulo t=new Triangulo(3,5);
	System.out.println(c.getArea());
	System.out.println(t.getArea());
	///
	Figura[] figuras= {c,t};
	System.out.println(figuras[0].getArea());
	System.out.println(figuras[1].getArea());
	System.out.println(((Cuadrado)figuras[0]).getLado());
	System.out.println(((Cuadrado)figuras[1]).getLado());
	
}
}
