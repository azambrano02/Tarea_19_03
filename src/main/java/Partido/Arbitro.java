package Partido;
public class Arbitro {
	private String nombre;
	private int rut;
	private Partido partido;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getRut() {
		return this.rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}

	public Arbitro(String nombre, int rut) {
		this.nombre = nombre;
		this.rut = rut;
	}
}