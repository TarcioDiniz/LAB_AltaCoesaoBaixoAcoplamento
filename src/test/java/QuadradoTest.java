import com.LAB_AltaCoesaoBaixoAcoplamento.Interfaces.FiguraGeometrica;
import com.LAB_AltaCoesaoBaixoAcoplamento.Model.Quadrado;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class QuadradoTest {

    @Test
    public void testCalcularArea() {
        FiguraGeometrica quadrado = new Quadrado(4);
        BigDecimal resultadoEsperado = new BigDecimal("4").multiply(new BigDecimal("4")).setScale(2, RoundingMode.HALF_UP);
        assertEquals(resultadoEsperado, quadrado.calcularArea());
    }

    @Test
    public void testCalcularPerimetro() {
        FiguraGeometrica quadrado = new Quadrado(4);
        BigDecimal resultadoEsperado = new BigDecimal("4").multiply(new BigDecimal("4")).setScale(2, RoundingMode.HALF_UP);
        assertEquals(resultadoEsperado, quadrado.calcularPerimetro());
    }

    @Test
    public void testCalcularAreaComLadoNegativo() {
        assertThrows(IllegalArgumentException.class, () -> new Quadrado(-5));
    }

    @Test
    public void testCalcularAreaComLadoZero() {
        FiguraGeometrica quadrado = new Quadrado(0);
        BigDecimal resultadoEsperado = BigDecimal.ZERO.setScale(2, RoundingMode.HALF_UP);
        assertEquals(resultadoEsperado, quadrado.calcularArea());
    }
}