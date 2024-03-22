package Empresa;
import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String especialidadDepa;
    private int codigoDepa;
    private List<Empleado> empleados;
    private Empleado administrador;

    public String getEspecialidadDepa() {
        return this.especialidadDepa;
    }
    public void setEspecialidadDepa(String especialidadDepa) {
        this.especialidadDepa = especialidadDepa;
    }
    public int getCodigoDepa() {
        return this.codigoDepa;
    }
    public void setCodigoDepa(int codigoDepa) {
        this.codigoDepa = codigoDepa;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }
    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }
    public Empleado getAdministrador() {
        return administrador;
    }
    public void setAdministrador(Empleado administrador) {
        this.administrador = administrador;
    }

    public Departamento(String especialidadDepa, int codigoDepa, Empleado administrador) {
        this.especialidadDepa = especialidadDepa;
        this.codigoDepa = codigoDepa;
        this.empleados = new ArrayList<>();
        this.administrador = administrador;
    }

}
