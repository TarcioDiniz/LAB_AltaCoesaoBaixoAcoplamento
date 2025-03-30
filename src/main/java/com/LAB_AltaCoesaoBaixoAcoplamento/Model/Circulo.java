package com.LAB_AltaCoesaoBaixoAcoplamento.Model;

import com.LAB_AltaCoesaoBaixoAcoplamento.Interfaces.FiguraGeometrica;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circulo implements FiguraGeometrica {
    private final int raio;
    private static final BigDecimal PI = new BigDecimal(Math.PI);

    public Circulo(int raio) {
        if (raio < 0) {
            throw new IllegalArgumentException("Raio não pode ser negativo.");
        }
        this.raio = raio;
    }

    @Override
    public BigDecimal calcularArea() {
        try {
            BigDecimal raioBigDecimal = new BigDecimal(raio);
            return PI.multiply(raioBigDecimal).multiply(raioBigDecimal).setScale(2, RoundingMode.HALF_UP);
        } catch (Exception e) {
            System.err.println("Erro ao calcular a área do círculo: " + e.getMessage());
            return BigDecimal.ZERO;
        }
    }

    @Override
    public BigDecimal calcularPerimetro() {
        try {
            BigDecimal raioBigDecimal = new BigDecimal(raio);
            return PI.multiply(new BigDecimal(2)).multiply(raioBigDecimal).setScale(2, RoundingMode.HALF_UP);
        } catch (Exception e) {
            System.err.println("Erro ao calcular o perímetro do círculo: " + e.getMessage());
            return BigDecimal.ZERO;
        }
    }

    @Override
    public String toString() {
        return "Círculo: raio = " + raio;
    }
}