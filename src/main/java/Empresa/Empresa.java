package Empresa;
import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private String nombreEmpresa;
	private List<Departamento> departamentos;
	private List<Oficina> oficinas;

	public String getNombreEmpresa() {
		return this.nombreEmpresa;
	}
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	public List<Departamento> getDepartamentos() {
		return departamentos;
	}
	public void setDepartamentos(List<Departamento> departamentos) {
		this.departamentos = departamentos;
	}
	public List<Oficina> getOficinas() {
		return oficinas;
	}
	public void setOficinas(List<Oficina> oficinas) {
		this.oficinas = oficinas;
	}

	public Empresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
		this.departamentos = new ArrayList<>();
		this.oficinas = new ArrayList<>();
	}
	public boolean agregarDepartamento(Departamento departamento) {
		if (!departamentoExiste(departamento)) {
			this.departamentos.add(departamento);
			return true;
		} else {
			return false;
		}
	}
	public boolean departamentoExiste(Departamento departamento) {
		for (Departamento d : this.departamentos) {
			if (departamento.getCodigoDepa() == d.getCodigoDepa()) {
				return true;
			}
		}
		return false;
	}
	public void eliminarDepartamento(int codigo){
		for (Departamento departamento : this.departamentos){
			if(departamento.getCodigoDepa()==codigo){
				this.departamentos.remove(departamento);
			}
		}
	}
	public Departamento buscarDepartamento(int codigo){
		for (Departamento d : this.departamentos){
			if(d.getCodigoDepa()==codigo){
				return d;
			}
		}
		return null;
	}
}