package abstract03;


public class Cuenta extends Producto{
	private int tipo;
	private double comisiones;
	
	//Getters and Setters
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public double getComisiones() {
		return comisiones;
	}
	public void setComisiones(double d) {
		this.comisiones = d;
	}
	
	//M�todos propios
	/**Ingresa la cantidad expresada en la cuenta
	 * 
	 * @param cantidad
	 */
	public void ingresoEnCuenta(double cantidad){
		setSaldo(getSaldo()+cantidad);
	}
	/**retira de la cuenta la cantidad expresada
	 * 
	 * @param cantidad
	 * @return verdadero si el saldo era suficiente y false en caso contrario
	 */
	public boolean retiradaEnCuenta(double cantidad){
		if(getSaldo()>cantidad){
			setSaldo(getSaldo()-cantidad);
			return true;
		}
		return false;
	}
	/**Calcula la cantidad que va a cobrar que depende del saldo
	 * 
	 * @return la cantidad a cobrar como comision
	 */
	private void calcularComision(){
		setComisiones(getSaldo()*getTipo());
	}
	/**Resta del saldo lo que se cobra en comisiones
	 * 
	 * @return Verdadero si las comisiones han podido cobrarse
	 */
	public boolean cobrarComision(){
		calcularComision();
		if (getSaldo()>comisiones){
			setSaldo(getSaldo()- comisiones);
			return true;
		}
		return false;
	}
}
