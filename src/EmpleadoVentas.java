public class EmpleadoVentas extends TrabajadorCorporativo{
private double ventasRealizadas;
private double comision = 0.10;

public EmpleadoVentas(String nombre, double sueldoBase, double ventasRealizadas){
    super(nombre, sueldoBase);
    this.ventasRealizadas = ventasRealizadas;
}

    @Override
    public double calcularBonoAnual() {
        return (sueldoBase * 0.5) + (ventasRealizadas * comision);
    }
}
