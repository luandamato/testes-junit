import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NotaClasseTest {

    public NotaClasseTest() {
    }

    NotasClasse objeto = new NotasClasse();

    @Test
    public void testarValidarAnoInvalido() {
        System.out.println("testando nota invalido");
        assertEquals("Nota inválida", objeto.validarNota(-4));
        assertEquals("Nota inválida", objeto.validarNota(12));

        assertEquals("Nota inválida", objeto.validarNota(-1));
        assertEquals("Nota inválida", objeto.validarNota(11));
    }

    @Test
    public void testarValidarAnoValido() {
        System.out.println("testando nota valido");
        assertEquals("Nota válida", objeto.validarNota(7));

        assertEquals("Nota válida", objeto.validarNota(0));
        assertEquals("Nota válida", objeto.validarNota(10));
    }

}
