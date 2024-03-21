package Empresa;
public class Empleado {
	private String nombre;
	private int rut;
	private Departamento departamento;

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

	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Empleado(String nombre, int rut, Departamento departamento) {
		this.nombre = nombre;
		this.rut = rut;
		this.departamento = departamento;
	}
}