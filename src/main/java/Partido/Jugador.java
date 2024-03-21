package Partido;
public class Jugador {
	private String nombre;
	private int numeroCamiseta;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroCamiseta() {
		return this.numeroCamiseta;
	}

	public void setNumeroCamiseta(int numeroCamiseta) {
		this.numeroCamiseta = numeroCamiseta;
	}

	public Jugador(String nombre, int numeroCamiseta) {
		this.nombre = nombre;
		this.numeroCamiseta = numeroCamiseta;
	}
}