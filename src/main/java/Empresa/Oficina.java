package Empresa;
public class Oficina {
	private int numOficina;
	private tipoOficina tipo;
	public int getNumOficina() {
		return this.numOficina;
	}
	public void setNumOficina(int numOficina) {
		this.numOficina = numOficina;
	}
	public tipoOficina getTipo() {
		return tipo;
	}
	public void setTipo(tipoOficina tipo) {
		this.tipo = tipo;
	}

	public Oficina(int numOficina, tipoOficina tipo) {
		this.numOficina = numOficina;
		this.tipo = tipo;
	}
	public tipoOficina getTipo(tipoOficina tipo) {
		return tipo;
	}
}