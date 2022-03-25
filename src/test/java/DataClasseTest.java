import org.junit.Test;
import static org.junit.Assert.*;

public class DataClasseTest {

    public DataClasseTest() {
    }

    DataClasse objeto = new DataClasse();

    @Test
    public void testarValidarAnoInvalido() {
        System.out.println("testando ano invalido");
        assertEquals("Data inválida", objeto.validarData(1890));
        assertEquals("Data inválida", objeto.validarData(2050));

        assertEquals("Data inválida", objeto.validarData(1899));
        assertEquals("Data inválida", objeto.validarData(2023));
    }

    @Test
    public void testarValidarAnoValido() {
        System.out.println("testando ano valido");
        assertEquals("Data válida", objeto.validarData(2015));

        assertEquals("Data válida", objeto.validarData(1900));
        assertEquals("Data válida", objeto.validarData(2022));
    }

}
