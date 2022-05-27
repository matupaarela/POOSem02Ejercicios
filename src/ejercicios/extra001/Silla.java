package ejercicios.extra001;

public class Silla {
    private String modelo;
    private double cantidad;
    private double precio;
    private String obsequio;

    public Silla(String modelo, double cantidad) {
        this.modelo = modelo;
        this.cantidad = cantidad;
    }

    public double getCantidad() { return cantidad; }

    public void setPrecioAndObsequio() {
        switch (modelo) {
            case "Silla De Comer Bebe Verde":
                precio = 142.5;
                obsequio = "Pañalera";
                break;
            case "Silla De Comer DOMCA - EB619":
                precio = 245.8;
                obsequio = "Juego didáctico";
                break;
            case "Silla De Comer Ezra Deluxe # Ev630":
                precio = 399.5;
                obsequio = "Rompecabezas";
                break;
        }
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
        setPrecioAndObsequio();
        return "Silla{" +
                "modelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                ", importeCompra=" + getImporteCompra() +
                ", importeDescuento=" + getImporteDescueto() +
                ", importePagar=" + getImportePagar() +
                ", obsequio='" + obsequio + '\'' +
                '}';
    }
}
