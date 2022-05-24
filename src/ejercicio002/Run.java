package ejercicio002;

public class Run {
    public static void main(String[] args) {
        Transporte transporte = new Transporte();

        transporte.agregarVehiculo(new Vehiculo("SFD-231", 2000, 40));
        transporte.agregarVehiculo(new Vehiculo("DFP-261", 2015, 20));
        transporte.agregarVehiculo(new Vehiculo("PER-666", 2020, 15.5));
        transporte.agregarVehiculo(new Vehiculo("YUS-221", 1960, 2));
        transporte.agregarVehiculo(new Vehiculo("ASD-326", 1860, 36));
        transporte.agregarVehiculo(new Vehiculo("POR-002", 2000, 32));
        transporte.agregarVehiculo(new Vehiculo("TER-888", 2016, 12));
        transporte.agregarVehiculo(new Vehiculo("DFF-321", 2019, 5));
        transporte.agregarVehiculo(new Vehiculo("POR-002", 2000, 3));
        transporte.agregarVehiculo(new Vehiculo("SSS-322", 1987, 10));
        transporte.agregarVehiculo(new Vehiculo("PDD-222", 2021, 50));
        transporte.agregarVehiculo(new Vehiculo("PWE-088", 1950, 11));

        transporte.listarVehiculos();
        System.out.println("la clasificación del vehículo es: " + transporte.getClasificacionPorPlaca("PER-666"));
        System.out.println("la capacidad de carga de todos lo vehiculos modernos es: " + transporte.calcularcapacidadCargaTotalModernos());
        transporte.listaVehiculosARenovarPorAntiguedad2();
    }
}
