package Hotel;
public class Cliente {
	private String nombre;
	private int rut;
	private Habitacion habitacion;

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

	public Habitacion getHabitacion() {
		return habitacion;
	}

	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}

	public Cliente(String nombre, int rut, Habitacion habitacion) {
		this.nombre = nombre;
		this.rut = rut;
		this.habitacion = habitacion;
	}

	public void reservarHabitacion(Habitacion habitacion) {
		throw new UnsupportedOperationException();
	}

	public void cancelarReserva(Habitacion habitacion) {
		throw new UnsupportedOperationException();
	}

	public boolean modificarHabitacion(Habitacion habitacion) {
		throw new UnsupportedOperationException();
	}
}