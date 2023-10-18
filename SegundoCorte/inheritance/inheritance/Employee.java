package herencia;

public class Employee extends Herencia {
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public Employee(String nombre, double sueldo) {
        super(nombre);
        this.idEmpleado = ++Employee.contadorEmpleado;
        this.sueldo = sueldo;
    }    

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee{");
        sb.append("idEmpleado=").append(idEmpleado);
        sb.append(", sueldo=").append(sueldo);
        sb.append(",").append(super.toString());
        sb.append('}');
        return sb.toString();
    }


   }
    

