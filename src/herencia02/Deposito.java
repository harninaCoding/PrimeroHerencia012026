package herencia02;


public class Deposito extends Producto{
	private float interes;
	private int plazoEnMeses;
	private double cantidadIntereses;
	
	//Getters and Setters
	public float getInteres() {
		return interes;
	}
	public void setInteres(float interes) {
		this.interes = interes;
	}
	public int getPlazoEnMeses() {
		return plazoEnMeses;
	}
	public void setPlazoEnMeses(int plazoEnMeses) {
		this.plazoEnMeses = plazoEnMeses;
	}
	public double getCantidadIntereses() {
		return cantidadIntereses;
	}
	public void setCantidadIntereses(double cantidadIntereses) {
		this.cantidadIntereses = cantidadIntereses;
	}
	
	//M�todos propios
	/** Calcula la cantidad de interes devengados mensualmente
	 * 
	 * @return la cantidad devengada
	 */
	private double calculaPeriodoMensual(){
		return 0.8*interes*getSaldo();
	}
	/**Incrementa los intereses cobrados este mes por el fondo en la propiedad
	 * Cantidad de intereses
	 */
	public void incrementarFondosInteres(){
		setCantidadIntereses(getCantidadIntereses()+calculaPeriodoMensual());		
	}
	/** Una vez al a�o los intereses generados se suman al saldo y la cantidad de 
	 * intereses se pone a cero
	 */
	public void incrementaSaldoAnual(){
		setSaldo(getSaldo()+getCantidadIntereses());
		setCantidadIntereses(0);
	}

}
