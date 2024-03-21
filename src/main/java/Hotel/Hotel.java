package Hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
	private String nombreHotel;
	private List<Habitacion> habitacions;
	private List<Cliente> clientes;

	public String getNombreHotel() {
		return this.nombreHotel;
	}

	public void setNombreHotel(String nombreHotel) {
		this.nombreHotel = nombreHotel;
	}

	public List<Habitacion> getHabitaciones() {
		return this.habitacions;
	}

	public void setHabitaciones(List<Habitacion> habitacions) {
		this.habitacions = habitacions;
	}

	public List<Cliente> getClientes() {
		return this.clientes;
	}
	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Hotel(String nombreHotel) {
		this.nombreHotel = nombreHotel;
		this.habitacions = new ArrayList<>();
		this.clientes = new ArrayList<>();
	}
}