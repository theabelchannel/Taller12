public class EmpleadoFijo extends Empleado {
    private double bonoAnual;

    public EmpleadoFijo(String nombre, double salarioBase, int horasTrabajadas, Departamento departamento, String genero, double bonoAnual) {
        super(nombre, salarioBase, horasTrabajadas, departamento,genero);
        this.bonoAnual = bonoAnual;
        
    }

    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("Bono Anual: " + bonoAnual);
    }

}

