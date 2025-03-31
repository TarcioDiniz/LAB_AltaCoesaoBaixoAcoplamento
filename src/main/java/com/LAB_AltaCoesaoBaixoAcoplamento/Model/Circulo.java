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
        BigDecimal raioBigDecimal = new BigDecimal(raio);
        return PI.multiply(raioBigDecimal).multiply(raioBigDecimal).setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    public BigDecimal calcularPerimetro() {
        BigDecimal raioBigDecimal = new BigDecimal(raio);
        return PI.multiply(new BigDecimal(2)).multiply(raioBigDecimal).setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    public String toString() {
        return "Círculo: raio = " + raio +
                ", área = " + calcularArea().toString() +
                ", perímetro = " + calcularPerimetro().toString();
    }
}
