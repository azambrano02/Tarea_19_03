package Restaurante;

import java.util.ArrayList;
import java.util.List;

public class Restaurantes_Billy {
	private String nombreCadena;
	private List<Local> locales;

	public String getNombreCadena() {
		return this.nombreCadena;
	}

	public void setNombreCadena(String nombreCadena) {
		this.nombreCadena = nombreCadena;
	}

	public List<Local> getLocales() {
		return this.locales;
	}

	public void setLocales(List<Local> locales) {
		this.locales = locales;
	}

	public Restaurantes_Billy(String nombreCadena) {
		this.nombreCadena = nombreCadena;
		this.locales = new ArrayList<>();
	}

	public void venderLocal(Local local) {
		throw new UnsupportedOperationException();
	}

	public Local modificarLocal(Local local) {
		throw new UnsupportedOperationException();
	}
}