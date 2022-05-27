package ejercicios.extra001.test;

import ejercicios.extra001.Silla;
import junit.framework.Assert;
import org.junit.Test;

public class SillaTest {
    @Test
    public void getImporteCompraTest() {
        Silla silla = new Silla("Silla De Comer Bebe Verde", 10);
        double actualAmount = silla.getImporteCompra();
        double expectedAmount = 1425d;

        Assert.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void getImporteDescuentoTest() {
        Silla silla = new Silla("Silla De Comer Bebe Verde", 10);
        double actualAmount = silla.getImporteDescueto();
        double expectedAmount = 142.5 * 10 * 0.085;

        Assert.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void getImportePagarTest() {
        Silla silla = new Silla("Silla De Comer Bebe Verde", 10);
        double actualAmount = silla.getImportePagar();
        double expectedAmount = 1303.875d;

        Assert.assertEquals(expectedAmount, actualAmount);
    }
}
