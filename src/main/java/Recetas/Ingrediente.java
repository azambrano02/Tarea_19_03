package Recetas;
public class Ingrediente {
	private String nombreIngrediente;

	public String getNombreIngrediente() {
		return this.nombreIngrediente;
	}

	public void setNombreIngrediente(String nombreIngrediente) {
		this.nombreIngrediente = nombreIngrediente;
	}

	public Ingrediente(String nombreIngrediente) {
		this.nombreIngrediente = nombreIngrediente;
	}
}