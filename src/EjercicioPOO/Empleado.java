package EjercicioPOO;

public abstract class Empleado {

    private String DNI, nombre, apellido;
    private int anioIngreso;

    public Empleado(String dNI, String nombre, String apellido, int anioIngreso) {
        DNI = dNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioIngreso = anioIngreso;
    }

    public abstract double getSalario();

    public String nombreCompleto() {

        return nombre + " " + apellido;
    }

}
