package abstract03;

public class Prueba02 {

	public static void main(String[] args) {
		Deposito uno=new Deposito();
		uno.setNumproducto(3l);
		System.out.println(uno.getCantidadIntereses());
		System.out.println(uno.getNumproducto());
		Cuenta cuenta=new Cuenta();
		Producto[] productos=new Producto[2];
		productos[0]=uno;
		productos[1]=cuenta;
		//no se puede porque es abstract
		Producto pro=new Producto();
	}

}
