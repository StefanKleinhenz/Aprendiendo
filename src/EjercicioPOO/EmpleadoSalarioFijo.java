package EjercicioPOO;

public class EmpleadoSalarioFijo extends Empleado {

    private static final double PORCENTAJE1 = 0.05;
    private static final double PORCENTAJE2 = 0.1;
    private double sueldoBasico;

    public EmpleadoSalarioFijo(String DNI, String nombre, String apellido, int anioIngreso, double sueldoBasico) {
        super(DNI, nombre, apellido, anioIngreso);
        this.sueldoBasico = sueldoBasico;

    }

    @Override
    public double getSalario() {

        return 0;
    }

    public double getPorcentajeAdicional() {
        return 0;
    }

}
