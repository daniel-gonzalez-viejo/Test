package daw.programacion.tienda;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class tiendaTest {
    
    @Test
    public void devolverPrecioTotal() {
        double pExpected = 4.0;
        int cExpected = 3;
        double tExpected = 12.0;

        ClaseTienda tien = new ClaseTienda(null, null, cExpected, pExpected);
        tien.setCantidad(cExpected);
        tien.setPrecioUnidad(pExpected);

        assertEquals(tExpected, tien.getTotal());

    }

    @Test
    public void devolverInfo() {
        ClaseTienda tien = new ClaseTienda(null, null, 0, 0);

        tien.setCantidad(4);
        tien.setPrecioUnidad(13.83);

        String id = tien.getId();
        String descripcion = tien.getDescripción();
        int cantidad = tien.getCantidad();
        double precio = tien.getPrecioUnidad();

        assertEquals("ClaseTienda [id=" + id + ", descripción=" + descripcion + ", cantidad=" + cantidad + ", precioUnidad="
        + precio + "]", tien.toString());
    }

}
