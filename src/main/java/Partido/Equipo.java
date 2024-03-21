package Partido;
import java.util.ArrayList;
import java.util.List;

public class Equipo {
	private String nombreEquipo;
	private List<Jugador> jugadores;
	private Jugador capitan;
	private Partido partido;

	public String getNombreEquipo() {
		return this.nombreEquipo;
	}
	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}
	public List<Jugador> getJugadores() {
		return this.jugadores;
	}
	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	public Jugador getCapitan() {
		return this.capitan;
	}
	public void setCapitan(Jugador capitan) {
		this.capitan = capitan;
	}

	public Equipo(String nombreEquipo, Jugador capitan) {
		this.nombreEquipo = nombreEquipo;
		this.capitan = capitan;
		this.jugadores = new ArrayList<>();
	}
}