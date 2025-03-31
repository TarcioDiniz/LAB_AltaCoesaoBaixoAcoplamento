package com.LAB_AltaCoesaoBaixoAcoplamento;

import com.LAB_AltaCoesaoBaixoAcoplamento.Interfaces.FiguraGeometrica;
import com.LAB_AltaCoesaoBaixoAcoplamento.Model.Circulo;
import com.LAB_AltaCoesaoBaixoAcoplamento.Model.Quadrado;
import com.LAB_AltaCoesaoBaixoAcoplamento.Model.Retangulo;

public class Main {
    public static void main(String[] args) {
        testarFigura("Retângulo válido", () -> new Retangulo(10, 5));
        testarFigura("Retângulo com altura negativa", () -> new Retangulo(-10, 5));
        testarFigura("Retângulo com largura negativa", () -> new Retangulo(10, -5));
        testarFigura("Quadrado válido", () -> new Quadrado(7));
        testarFigura("Quadrado com lado negativo", () -> new Quadrado(-7));
        testarFigura("Círculo válido", () -> new Circulo(25));
        testarFigura("Círculo com raio negativo", () -> new Circulo(-25));
    }

    private static void testarFigura(String descricao, FiguraFactory factory) {
        System.out.println("\n" + descricao + ":");
        try {
            FiguraGeometrica figura = factory.criar();
            System.out.println(figura);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    @FunctionalInterface
    interface FiguraFactory {
        FiguraGeometrica criar();
    }
}
