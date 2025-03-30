package com.LAB_AltaCoesaoBaixoAcoplamento.Model;

import com.LAB_AltaCoesaoBaixoAcoplamento.Interfaces.FiguraGeometrica;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class Retangulo implements FiguraGeometrica {
    private final int altura;
    private final int largura;

    public Retangulo(int largura, int altura) {
        if (largura < 0 || altura < 0) {
            throw new IllegalArgumentException("Largura e altura não podem ser negativos.");
        }
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public BigDecimal calcularArea() {
        try {
            BigDecimal alturaBigDecimal = new BigDecimal(altura);
            BigDecimal larguraBigDecimal = new BigDecimal(largura);
            return alturaBigDecimal.multiply(larguraBigDecimal).setScale(2, RoundingMode.HALF_UP);
        } catch (Exception e) {
            System.err.println("Erro ao calcular a área do retângulo: " + e.getMessage());
            return BigDecimal.ZERO;
        }
    }

    @Override
    public BigDecimal calcularPerimetro() {
        try {
            BigDecimal alturaBigDecimal = new BigDecimal(altura);
            BigDecimal larguraBigDecimal = new BigDecimal(largura);
            return alturaBigDecimal.add(larguraBigDecimal).multiply(new BigDecimal(2)).setScale(2, RoundingMode.HALF_UP);
        } catch (Exception e) {
            System.err.println("Erro ao calcular o perímetro do retângulo: " + e.getMessage());
            return BigDecimal.ZERO;
        }
    }

    @Override
    public String toString() {
        return "Retângulo: altura = " + altura + ", largura = " + largura;
    }
}