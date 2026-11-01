package vethub.service;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 *
 * @author Arthur
 */
public class ValidadorServiceTest {
    
    private ValidadorService validador;
    
    @Before
    public void setUp() {
        validador = new ValidadorService();
    }

    @Test
    public void testValidarPesoComVirgula(){
        assertTrue( "O peso 5,5 deve ser válido.", validador.validarPeso("5.5"));
    }
    
    @Test
    public void testValidarPesoComTexto(){
        assertFalse("Texto deve ser inválido.", validador.validarPeso("peso"));
    }
   
    @Test
    public void testValidarDataCorreta(){
        assertTrue("A data 01/01/2027 é válida.", validador.validarData("01/01/2027"));
    }
    
    @Test
    public void testValidarDataIncorreta(){
        assertFalse("A data 03/13/36 não é válida.", validador.validarData("03/13/36"));
    }
}
