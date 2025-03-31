package com.LAB_AltaCoesaoBaixoAcoplamento.Model;

import com.LAB_AltaCoesaoBaixoAcoplamento.Interfaces.FiguraGeometrica;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Quadrado implements FiguraGeometrica {
    private final int lado;

    public Quadrado(int lado) {
        if (lado < 0) {
            throw new IllegalArgumentException("O lado não pode ser negativo.");
        }
        this.lado = lado;
    }

    @Override
    public BigDecimal calcularArea() {
        BigDecimal ladoBigDecimal = new BigDecimal(lado);
        return ladoBigDecimal.multiply(ladoBigDecimal).setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    public BigDecimal calcularPerimetro() {
        BigDecimal ladoBigDecimal = new BigDecimal(lado);
        return ladoBigDecimal.multiply(new BigDecimal(4)).setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    public String toString() {
        return "Quadrado: lado = " + lado +
                ", área = " + calcularArea().toString() +
                ", perímetro = " + calcularPerimetro().toString();
    }
}
