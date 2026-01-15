package abstract03;

public abstract class Producto {
	private long numproducto;
	private double saldo;
	private long numcliente;
	
	//grupo de m�todos getters and setters
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public long getNumproducto() {
		return numproducto;
	}
	public void setNumproducto(long numproducto) {
		this.numproducto = numproducto;
	}
	public long getNumcliente() {
		return numcliente;
	}
	public void setNumcliente(long numcliente) {
		this.numcliente = numcliente;
	}
	
}
