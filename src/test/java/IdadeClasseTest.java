import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IdadeClasseTest {

    public IdadeClasseTest() {
    }

    IdadeClasse objeto = new IdadeClasse();

    @Test
    public void validar10Anos() {
        System.out.println("testando renovar em 10 anos");

        assertEquals("renovação a cada 10 anos", objeto.validarIdade(35));
        assertEquals("renovação a cada 10 anos", objeto.validarIdade(49));
    }

    @Test
    public void validar5Anos() {
        System.out.println("testando renovar em 5 anos");

        assertEquals("renovação a cada 5 anos", objeto.validarIdade(55));
        assertEquals("renovação a cada 5 anos", objeto.validarIdade(69));
    }

    @Test
    public void validar3Anos() {
        System.out.println("testando  renovar em 3 anos");

        assertEquals("renovação a cada 3 anos", objeto.validarIdade(74));
        assertEquals("renovação a cada 3 anos", objeto.validarIdade(70));
    }

}
