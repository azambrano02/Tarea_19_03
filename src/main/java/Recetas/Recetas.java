package Recetas;

import java.util.ArrayList;
import java.util.List;

public class Recetas {
	private String pasos;
	private List<Ingrediente> ingredientes;
	private String nombreReceta;

	public String getPasos() {
		return this.pasos;
	}

	public void setPasos(String pasos) {
		this.pasos = pasos;
	}

	public List<Ingrediente> getIngredientes() {
		return this.ingredientes;
	}

	public void setIngredientes(List<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public String getNombreReceta() {
		return this.nombreReceta;
	}

	public void setNombreReceta(String nombreReceta) {
		this.nombreReceta = nombreReceta;
	}

	public Recetas(String pasos, String nombreReceta) {
		this.pasos = pasos;
		this.ingredientes = new ArrayList<>();
		this.nombreReceta = nombreReceta;
	}
}