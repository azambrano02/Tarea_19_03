package Restaurante;
public class Local {
	private double ingresos;
	private String ciudad;

	public double getIngresos() {
		return this.ingresos;
	}

	public void setIngresos(double ingresos) {
		this.ingresos = ingresos;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Local(double ingresos, String ciudad) {
		this.ingresos = ingresos;
		this.ciudad = ciudad;
	}

	public double calcularIngresos(double ingresos) {
		throw new UnsupportedOperationException();
	}

	public void crearVenta() {
		throw new UnsupportedOperationException();
	}
}