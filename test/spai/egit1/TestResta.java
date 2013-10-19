package spai.egit1;

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestResta {
    private Resta resta;
    @Before
    public void paraEjecutarAntes() throws Exception {
        resta = new Resta();
    }
    @Test
    public void aVerSiRestaBien() {
        assertEquals("Test decrementa", 5.0, resta.decrementa(6.0), 1e-6);
    }
    @Test
    public void aVerSiSacaLaDiferencia() {
        assertEquals("Test resta", 5.0, resta.getDiferencia(8.0, 3.0), 1e-6);
    }
    @After
    public void paraEjecutarDespues() throws Exception {
    }
}
