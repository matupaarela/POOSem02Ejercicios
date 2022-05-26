package ejercicios.extra001;

public class Silla {
    private String modelo;
    private double precio;
    private double cantidad;

    public Silla(String modelo, double precio, double cantidad) {
        this.modelo = modelo;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getObsequio() {
        String obsequio = "Ninguno";
        switch (modelo) {
            case "Silla De Comer Bebe Verde":
                obsequio = "Pañalera";
                break;
            case "Silla De Comer DOMCA - EB619":
                obsequio = "Juego didáctico";
                break;
            case "Silla De Comer Ezra Deluxe # Ev630":
                obsequio = "Rompecabezas";
                break;
        }
        return obsequio;
    }

    public double getImporteCompra() {
        return cantidad * precio;
    }

    public double getImporteDescueto() {
        double descuento = 0;
        if (cantidad >= 7 && cantidad < 10) descuento = 0.066;
        if (cantidad >= 10 && cantidad < 15) descuento = 0.085;
        if (cantidad >= 15) descuento = 0.11;

        return getImporteCompra() * descuento;
    }

    public double getImportePagar() {
        return getImporteCompra() - getImporteDescueto();
    }

    @Override
    public String toString() {
        return "Silla{" +
                "modelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                ", importeCompra=" + getImporteCompra() +
                ", importeDescuento=" + getImporteDescueto() +
                ", importePagar=" + getImportePagar() +
                ", obsequio='" + getObsequio() + '\'' +
                '}';
    }
}
