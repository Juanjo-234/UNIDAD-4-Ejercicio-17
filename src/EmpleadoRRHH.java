public class EmpleadoRRHH extends TrabajadorCorporativo{
    private double indiceRetencionPersonal;

    public EmpleadoRRHH(String nombre, double sueldoBase, double indiceRetencionPersonal){
        super(nombre, sueldoBase);
        this.indiceRetencionPersonal = indiceRetencionPersonal;
    }

    @Override
    public double calcularBonoAnual() {
        return (sueldoBase * 0.6 * indiceRetencionPersonal);
    }
}
