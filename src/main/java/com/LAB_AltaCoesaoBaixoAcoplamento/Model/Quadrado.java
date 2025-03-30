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
        try {
            BigDecimal ladoBigDecimal = new BigDecimal(lado);
            return ladoBigDecimal.multiply(ladoBigDecimal).setScale(2, RoundingMode.HALF_UP);
        } catch (Exception e) {
            System.err.println("Erro ao calcular a área do quadrado: " + e.getMessage());
            return BigDecimal.ZERO;
        }
    }

    @Override
    public BigDecimal calcularPerimetro() {
        try {
            BigDecimal ladoBigDecimal = new BigDecimal(lado);
            return ladoBigDecimal.multiply(new BigDecimal(4)).setScale(2, RoundingMode.HALF_UP);
        } catch (Exception e) {
            System.err.println("Erro ao calcular o perímetro do quadrado: " + e.getMessage());
            return BigDecimal.ZERO;
        }
    }

    @Override
    public String toString() {
        return "Quadrado: lado = " + lado;
    }
}
