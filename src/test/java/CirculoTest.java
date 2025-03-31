import com.LAB_AltaCoesaoBaixoAcoplamento.Interfaces.FiguraGeometrica;
import com.LAB_AltaCoesaoBaixoAcoplamento.Model.Circulo;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CirculoTest {

    @Test
    public void testCalcularArea() {
        FiguraGeometrica circulo = new Circulo(5);
        BigDecimal resultadoEsperado = new BigDecimal(Math.PI).multiply(new BigDecimal("5")).multiply(new BigDecimal("5")).setScale(2, RoundingMode.HALF_UP);
        assertEquals(resultadoEsperado, circulo.calcularArea());
    }

    @Test
    public void testCalcularPerimetro() {
        FiguraGeometrica circulo = new Circulo(5);
        BigDecimal resultadoEsperado = new BigDecimal(Math.PI).multiply(new BigDecimal("2")).multiply(new BigDecimal("5")).setScale(2, RoundingMode.HALF_UP);
        assertEquals(resultadoEsperado, circulo.calcularPerimetro());
    }

    @Test
    public void testCalcularAreaComRaioNegativo() {
        assertThrows(IllegalArgumentException.class, () -> new Circulo(-5));
    }

    @Test
    public void testCalcularAreaComRaioZero() {
        FiguraGeometrica circulo = new Circulo(0);
        BigDecimal resultadoEsperado = BigDecimal.ZERO.setScale(2, RoundingMode.HALF_UP);
        assertEquals(resultadoEsperado, circulo.calcularArea());
    }

}