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
	public boolean ingredienteExiste(Ingrediente ingrediente){
		for (Ingrediente i : this.ingredientes){
			if(ingrediente.getNombreIngrediente().equals(i.getNombreIngrediente())){
				return true;
			}
		}
		return false;
	}
	public boolean agregarIngrediente(Ingrediente ingrediente){
		if(!ingredienteExiste(ingrediente)){
			this.ingredientes.add(ingrediente);
			return true;
		}
		return false;
	}

	public void eliminarIngrediente (String nombre){
		for (Ingrediente ingrediente : this.ingredientes){
			if(ingrediente.getNombreIngrediente().equals(nombre)){
				this.ingredientes.remove(ingrediente);
			}
		}
	}
	public Ingrediente buscarIngrediente (String nombre){
		for(Ingrediente i : this.ingredientes){
			if (i.getNombreIngrediente().equals(nombre)){
				return i;
			}
		}
		return null;
	}
}