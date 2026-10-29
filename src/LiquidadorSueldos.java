import java.util.List;

public class LiquidadorSueldos {
    public void procesarLiquidacion(TrabajadorCorporativo trabajador) {
        double bono = trabajador.calcularBonoAnual();
        double totalAnualEstimado = (trabajador.getSueldoBase() * 12) + bono;

        System.out.println("--------------------------------------------------");
        System.out.println("EMPLEADO: " + trabajador.getNombre() + " (" + trabajador.getClass().getSimpleName() + ")");
        System.out.printf("Sueldo Base Mensual: $%.2f\n", trabajador.getSueldoBase());
        System.out.printf("Bono Anual:          $%.2f\n", bono);
        System.out.printf("Total Anual Proyect.: $%.2f\n", totalAnualEstimado);
        System.out.println("------------------------------------------------..\n");
    }


    public void procesarLote(List<TrabajadorCorporativo> trabajadores) {
        System.out.println("=== INICIO DE LIQUIDACIÓN DE SUELDOS Y BONOS ===\n");
        for (TrabajadorCorporativo trabajador : trabajadores) {
            procesarLiquidacion(trabajador);
        }
    }
}
