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
		for (Local l : this.locales) {
			if (local.getCiudad().equals(l.getCiudad())) {
				this.locales.remove(l);
			}
		}
	}

	public void modificarLocal(Local local, String ciudad) {
		for (Local l : this.locales) {
			if (local.getCiudad().equals(l.getCiudad())) {
				l.setCiudad(ciudad);
			}
		}
	}

	public boolean localExiste(Local local) {
		for (Local l : this.locales) {
			if (local.getCiudad().equals(l.getCiudad())) {
				return true;
			}
		}
		return false;
	}

	public boolean agregarLocal(Local local) {
		if (!localExiste(local)) {
			this.locales.add(local);
			return true;
		}
		return false;
	}
	public void eliminarLocal (String ciudad){
		for (Local l : this.locales){
			if(l.getCiudad().equals(ciudad)){
				this.locales.remove(l);
			}
		}
	}
	public Local buscarLocal(String ciudad){
		for (Local l : this.locales){
			if(l.getCiudad().equals(ciudad)){
				return l;
			}
		}
		return null;
	}

}