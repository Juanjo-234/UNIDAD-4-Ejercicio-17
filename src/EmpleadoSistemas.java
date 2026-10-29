public class EmpleadoSistemas extends TrabajadorCorporativo{
    private int proyectos_Exitosos;
    private double premio_proyecto = 15000.0;

    public EmpleadoSistemas(String nombre, double sueldoBase, int proyectos_Exitosos){
        super(nombre, sueldoBase);
        this.proyectos_Exitosos = proyectos_Exitosos;
    }

    @Override
    public double calcularBonoAnual() {
        return (sueldoBase * 0.8) + (proyectos_Exitosos * premio_proyecto);
    }
}
