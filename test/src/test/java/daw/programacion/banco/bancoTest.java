package daw.programacion.banco;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class bancoTest {

    @Test
    public void sacarDinero() {
        int dineroCuentaExpected = 1200;
        int sacarExpected = 2800;
        
    
        ClaseBanco ban = new ClaseBanco(null, null, dineroCuentaExpected);

        ban.setBalance(4000);

        int dineroFinal = ban.debito(sacarExpected);

        assertEquals(dineroCuentaExpected, dineroFinal);

    }

    @Test
    public void sacarDineroCredito() {
        int dineroActual = 4000;
        int dineroCredito = 2000;
        int dineroCuentaExpected = dineroActual + dineroCredito;

        ClaseBanco ban = new ClaseBanco(null, null, dineroActual);

        ban.setBalance(dineroActual);

        int dineroFinal = ban.credito(dineroCredito);

        assertEquals(dineroCuentaExpected, dineroFinal);
    }

    @Test
    public void hacerTransferencia() {
        int dineroActual = 4000;
        int otraCuenta = 0;
        int dineroTransferido = 2000;
        int dineroExpected = dineroActual - dineroTransferido;
        
        ClaseBanco ban = new ClaseBanco(null, null, dineroActual);

        ban.setBalance(dineroActual);
        
        int dineroFinal = ban.transferencia(dineroTransferido, otraCuenta);

        assertEquals(dineroExpected, dineroFinal);
    }
    
}
