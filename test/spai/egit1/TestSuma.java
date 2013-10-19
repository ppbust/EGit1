package spai.egit1;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestSuma {
    private Suma suma;
    @Before
    public void paraEjecutarAntes() throws Exception {
        suma = new Suma();
    }
    @Test
    public void aVerSiIncrementaBien() {
        assertEquals("Test incrementa", 2.0, suma.incrementa(1.0), 1e-6);
    }
    @Test
    public void aVerSiSumaBien() {
        assertEquals("Test suma", 2.0, suma.getSuma(1.0, 1.0), 1e-6);
    }
    @After
    public void paraEjecutarDespues() throws Exception {
    }

}
