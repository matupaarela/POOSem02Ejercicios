package ejercicios.extra001;

/**
 * Una tienda mayorista, ha puesto en oferta la venta de sillas de comer para bebes, a los precios
 * dados en la siguiente tabla
 *
 *      MODELO                             | PRECIO
 *      ___________________________________|__________
 *      Silla De Comer Bebe Verde          | 142.5
 *      Silla De Comer DOMCA - EB619       | 245.8
 *      Silla De Comer Ezra Deluxe # Ev630 | 399.5
 *
 * como oferta, la empresa aplica un descuento igual a un porcentaje del importe de compra
 * de acuerdo a la siguiente tabla:
 *
 *      CANTIDAD DE SILLAS  | DESCUENTO
 *      ____________________|_________
 *          < 7             | 0%
 *          >= 7 y < 10     | 6.6%
 *          >= 10 y < 15    | 8.5%
 *          >= 15           | 11%
 *
 * Adicionalmente la empresa entrega obsequios de acuerdo a la siguiente tabla:
 *
 *      MODELO                             | OBSEQUIO
 *      ___________________________________|_________________
 *      Silla De Comer Bebe Verde          | Pañalera
 *      Silla De Comer DOMCA - EB619       | Juego didáctico
 *      Silla De Comer Ezra Deluxe # Ev630 | Rompecabezas
 *
 * Diseñe un programa que determine el importe de la compra (switch), el importe del descuento
 * el importe a pagar y el obsequio por la compra de cierta cantidad de sillas de comer del mismo
 * modelo.
 */


public class Run {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();

        tienda.addSilla(new Silla("Silla De Comer Bebe Verde", 142.5, 1));
        tienda.addSilla(new Silla("Silla De Comer DOMCA - EB619", 245.8, 10));
        tienda.addSilla(new Silla("Silla De Comer Ezra Deluxe # Ev630", 399.5, 20));

        tienda.addSilla(new Silla("Silla De Comer Bebe Verde", 142.5, 10));
        tienda.addSilla(new Silla("Silla De Comer DOMCA - EB619", 245.8, 5));
        tienda.addSilla(new Silla("Silla De Comer Ezra Deluxe # Ev630", 399.5, 50));

        tienda.printSillas();
    }
}
