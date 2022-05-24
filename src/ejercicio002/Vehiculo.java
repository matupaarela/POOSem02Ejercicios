package ejercicio002;

public class Vehiculo {
    private String placa;
    private int año;
    private double capacidadCarga;

    public Vehiculo(String placa, int año, double capacidadCarga) {
        this.placa = placa;
        this.año = año;
        this.capacidadCarga = capacidadCarga;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public String getClasificacion() {
        String clasificacion = null;
        if (this.año >= 2015)
            clasificacion = "moderno";
        else if (this.año >= 2000 && this.año < 2015)
            clasificacion = "normal";
        else
            clasificacion = "antiguo";

        return clasificacion;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "placa='" + placa + '\'' +
                ", año=" + año +
                ", capacidadCarga=" + capacidadCarga +
                ", clasificacion='" + getClasificacion() + "'" +
                '}';
    }
}
