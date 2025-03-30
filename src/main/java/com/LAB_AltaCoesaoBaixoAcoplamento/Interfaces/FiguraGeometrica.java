package com.LAB_AltaCoesaoBaixoAcoplamento.Interfaces;

import java.math.BigDecimal;

public interface FiguraGeometrica {
    BigDecimal calcularArea();

    BigDecimal calcularPerimetro();

    String toString();
}