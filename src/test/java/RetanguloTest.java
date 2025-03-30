import com.LAB_AltaCoesaoBaixoAcoplamento.Interfaces.FiguraGeometrica;
import com.LAB_AltaCoesaoBaixoAcoplamento.Model.Retangulo;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RetanguloTest {

    @Test
    public void testCalcularArea() {
        FiguraGeometrica retangulo = new Retangulo(5, 8);
        BigDecimal resultadoEsperado = new BigDecimal("5").multiply(new BigDecimal("8")).setScale(2, RoundingMode.HALF_UP);
        assertEquals(resultadoEsperado, retangulo.calcularArea());
    }

    @Test
    public void testCalcularPerimetro() {
        FiguraGeometrica retangulo = new Retangulo(5, 8);
        BigDecimal resultadoEsperado = new BigDecimal("2").multiply(new BigDecimal("5").add(new BigDecimal("8"))).setScale(2, RoundingMode.HALF_UP);
        assertEquals(resultadoEsperado, retangulo.calcularPerimetro());
    }

    @Test
    public void testCalcularAreaComAlturaNegativa() {
        assertThrows(IllegalArgumentException.class, () -> new Retangulo(-5, 8));
    }

    @Test
    public void testCalcularAreaComLarguraNegativa() {
        assertThrows(IllegalArgumentException.class, () -> new Retangulo(5, -8));
    }

    @Test
    public void testCalcularAreaComAlturaELarguraZero() {
        FiguraGeometrica retangulo = new Retangulo(0, 0);
        BigDecimal resultadoEsperado = BigDecimal.ZERO.setScale(2, RoundingMode.HALF_UP);
        assertEquals(resultadoEsperado, retangulo.calcularArea());
    }
}