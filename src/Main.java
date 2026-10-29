//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    List<TrabajadorCorporativo> nomina = new ArrayList<>();

    nomina.add(new EmpleadoVentas("Carlos Gómez", 120000.00, 250000.00));
    nomina.add(new EmpleadoSistemas("Lucía Fernández", 180000.00, 4));
    nomina.add(new EmpleadoRRHH("Marcos Pérez", 110000.00, 0.92));

    LiquidadorSueldos liquidador = new LiquidadorSueldos();
    liquidador.procesarLote(nomina);
}
