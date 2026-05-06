import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.example.Calculadora;

public class CalculadoraTest {

    @Test
    void testSumar() {
        assertEquals(6, new Calculadora().sumar(2, 3));
    }
}