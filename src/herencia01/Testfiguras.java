package herencia01;


class Testfiguras {
public static void main(String[] args) {
	Cuadrado c=new Cuadrado(5);
	c.setColor("rosa");
//	System.out.println("el area del cuadrado es "+c.getArea());
//	System.out.println("el lado del cuadrado es "+c.getLado());
//	System.out.println("el color del cuadrado es "+c.getColor());
	Class<? extends Cuadrado> class1 = c.getClass();
//	System.out.println(class1.toString());
//	System.out.println(class1.toGenericString());
//	System.out.println(class1);
//	System.out.println(class1.getSuperclass());
	System.out.println(class1);
	Class<?> padre = class1.getSuperclass();
	System.out.println(padre);
	Class<?> abuelo = padre.getSuperclass();
	System.out.println(abuelo);
	Class<?> bisabuelo = abuelo.getSuperclass();
	System.out.println(bisabuelo);
	/*
	c.setColor(Messages.getString("Testfiguras.0")); //$NON-NLS-1$
	System.out.println(Messages.getString("Testfiguras.1")+c.getColor()); //$NON-NLS-1$
	System.out.println(Messages.getString("Testfiguras.2")+c.getArea()); //$NON-NLS-1$*/
}
}
