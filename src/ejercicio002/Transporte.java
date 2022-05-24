package ejercicio002;

import java.util.ArrayList;
import java.util.List;

public class Transporte {
    private List<Vehiculo> vehiculos;
    public Transporte() {
        vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        if (vehiculos.size() < 10) {
            vehiculos.add(vehiculo);
        } else System.out.println("El vehiculo: " + vehiculo +  " no se pudo agregar por falta de capacidad!");
    }

    public String getClasificacionPorPlaca(String placa) {
        String clasificacion = null;
        for (Vehiculo veh : vehiculos) {
            if(veh.getPlaca().equals(placa))
                clasificacion = veh.getClasificacion();
        }
        return clasificacion;
    }

    public double calcularcapacidadCargaTotalModernos() {
        double capadidadTotal = 0;
        for (Vehiculo veh : vehiculos) {
            if(veh.getClasificacion().equals("moderno"))
                capadidadTotal += veh.getCapacidadCarga();
        }
        return capadidadTotal;
    }

    public List<Vehiculo> listaVehiculosARenovarPorAntiguedad() {
        List<Vehiculo> vehculosAntiguos = new ArrayList<>();
        for (Vehiculo veh : vehiculos) {
            if(veh.getClasificacion().equals("antiguo"))
                vehculosAntiguos.add(veh);
        }
        return vehculosAntiguos;
    }

    public void listaVehiculosARenovarPorAntiguedad2() {
        System.out.println("Lista de vehiculos antiguos a renovar:");
        for (Vehiculo veh : vehiculos) {
            if(veh.getClasificacion().equals("antiguo"))
                System.out.println(veh);
        }
    }

    public void listarVehiculos() {
        for (Vehiculo veh : vehiculos) {
            System.out.println(veh);
        }
    }
}
