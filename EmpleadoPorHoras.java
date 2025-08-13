public class EmpleadoPorHoras extends Empleado {
    private double tarifaHora;

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaHora, String genero, Departamento departamento) {
        super(nombre, 0, horasTrabajadas, departamento, genero);
        super.setSalarioBase(calcularSalario());
        this.tarifaHora = tarifaHora; 
    }

    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles();
    }

    @Override
      public double calcularSalario() {
        return getHorasTrabajadas() * getTarifaHora();
    }
 
    // Más metodos
    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }
} 

