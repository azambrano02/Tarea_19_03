package Partido;

import java.util.Date;
import java.util.List;

public class Partido {
	private Date fecha;
	private List<Arbitro> arbitros;
	private Equipo equipo1;
	private Equipo equipo2;

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public List<Arbitro> getArbitros() {
		return this.arbitros;
	}

	public void setArbitros(List<Arbitro> arbitros){
		this.arbitros = arbitros;
	}

	public Equipo getEquipo1() {
		return this.equipo1;
	}

	public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}

	public Equipo getEquipo2() {
		return this.equipo2;
	}

	public void setEquipo2(Equipo equipo2) {
		this.equipo2 = equipo2;
	}

	public Partido(Date fecha, Equipo equipo1, Equipo equipo2) {
		this.fecha = fecha;
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
	}
	public boolean arbitroExiste(Arbitro arbitro){
		for(Arbitro a : this.arbitros){
			if(arbitro.getRut()==a.getRut()) {
				return true;
			}
		}
		return false;
	}
	public boolean agregarArbitro(Arbitro arbitro){
		if(!arbitroExiste(arbitro)){
			this.arbitros.add(arbitro);
			return true;
		} else {
			return false;
		}
	}
	public void eliminarArbitro(int rut){
		for (Arbitro arbitro : this.arbitros){
			if(arbitro.getRut()==rut){
				this.arbitros.remove(arbitro);
			}
		}
	}
	public Arbitro buscarArbitro(int rut){
		for (Arbitro arbitro : this.arbitros){
			if(arbitro.getRut()==rut){
				return arbitro;
			}
		}
		return null;
	}
}