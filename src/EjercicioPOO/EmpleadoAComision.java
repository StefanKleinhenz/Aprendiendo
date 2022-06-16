package EjercicioPOO;

public class EmpleadoAComision extends Empleado {

    private double salarioMinomo;
    private int cantidadClientesCaptados;
    private double montoPorCliente;

    public EmpleadoAComision(String DNI, String nombre, String apellido, int anioIngreso, double salarioMinomo,
            int cantidadClientesCaptados, Double montoPorCliente) {
        super(DNI, nombre, apellido, anioIngreso);
        this.salarioMinomo = salarioMinomo;
        this.cantidadClientesCaptados = cantidadClientesCaptados;
        this.montoPorCliente = montoPorCliente;
    }

    @Override
    public double getSalario() {

        return 0;
    }

}
