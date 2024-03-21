package Hotel;
public class Habitacion {
	private int numHabitacion;
	private TipoHabitacion tipo;
	private EstadoHabitacion estado;

	public int getNumHabitacion() {
		return this.numHabitacion;
	}

	public void setNumHabitacion(int numHabitacion) {
		this.numHabitacion = numHabitacion;
	}

	public TipoHabitacion getTipo() {
		return tipo;
	}

	public void setTipo(TipoHabitacion tipo) {
		this.tipo = tipo;
	}

	public EstadoHabitacion getEstado() {
		return estado;
	}

	public void setEstado(EstadoHabitacion estado) {
		this.estado = estado;
	}

	public Habitacion(int numHabitacion, TipoHabitacion tipo, EstadoHabitacion estado) {
		this.numHabitacion = numHabitacion;
		this.tipo = tipo;
		this.estado = estado;
	}

	public TipoHabitacion getTipo(TipoHabitacion tipo) {
		return tipo;
	}
	public EstadoHabitacion getTipo(EstadoHabitacion estado) {
		return estado;
	}
}