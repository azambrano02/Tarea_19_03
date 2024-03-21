package Recetas;
public class Usuario {
	private String nombre;
	private int rut;

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

	public Usuario(String nombre, int rut) {
		this.nombre = nombre;
		this.rut = rut;
	}
	public boolean agregarReceta(Recetas receta) {
		throw new UnsupportedOperationException();
	}
	public void eliminarReceta(String nombreReceta) {
		throw new UnsupportedOperationException();
	}
}