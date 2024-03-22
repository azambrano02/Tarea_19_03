package Hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
	private String nombreHotel;
	private List<Habitacion> habitaciones;
	private List<Cliente> clientes;

	public String getNombreHotel() {
		return this.nombreHotel;
	}

	public void setNombreHotel(String nombreHotel) {
		this.nombreHotel = nombreHotel;
	}

	public List<Habitacion> getHabitaciones() {
		return this.habitaciones;
	}

	public void setHabitaciones(List<Habitacion> habitacions) {
		this.habitaciones = habitacions;
	}

	public List<Cliente> getClientes() {
		return this.clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Hotel(String nombreHotel) {
		this.nombreHotel = nombreHotel;
		this.habitaciones = new ArrayList<>();
		this.clientes = new ArrayList<>();
	}

	public boolean agregarHabitacion(Habitacion habitacion) {
		if (!habitacionExiste(habitacion)) {
			this.habitaciones.add(habitacion);
			return true;
		} else {
			return false;
		}
	}

	public boolean habitacionExiste(Habitacion habitacion) {
		for (Habitacion h : this.habitaciones) {
			if (habitacion.getNumHabitacion() == h.getNumHabitacion()) {
				return true;
			}
		}
		return false;
	}
	public void eliminarHabitacion(int num){
		for (Habitacion habitacion : this.habitaciones){
			if(habitacion.getNumHabitacion()==num){
				this.habitaciones.remove(habitacion);
			}
		}
	}
	public Habitacion buscarHabitaciones(int num){
		for (Habitacion h : this.habitaciones){
			if(h.getNumHabitacion()==num){
				return h;
			}
		}
		return null;
	}
}