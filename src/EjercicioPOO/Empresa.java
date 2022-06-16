package EjercicioPOO;

import java.util.ArrayList;

public class Empresa {

    ArrayList<Empleado> empleados = new ArrayList<>();

    public void agregarEmpleado(Empleado empleado) {

        this.empleados.add(empleado);
    }

    public void mostrarSalarios() {

        empleados.stream().forEach(e -> System.out.println(e.nombreCompleto()+", Salario: "+e.getSalario()));

    }

    public Empleado empleadoConMasClientes() {
        return null;
    }

}
