package com.LAB_AltaCoesaoBaixoAcoplamento;

import com.LAB_AltaCoesaoBaixoAcoplamento.Interfaces.FiguraGeometrica;
import com.LAB_AltaCoesaoBaixoAcoplamento.Model.Circulo;
import com.LAB_AltaCoesaoBaixoAcoplamento.Model.Quadrado;
import com.LAB_AltaCoesaoBaixoAcoplamento.Model.Retangulo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Retângulo válido:");
        try {
            FiguraGeometrica retangulo = new Retangulo(10, 5);
            System.out.println(retangulo);
            System.out.println("Área: " + retangulo.calcularArea());
            System.out.println("Perímetro: " + retangulo.calcularPerimetro());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar retângulo: " + e.getMessage());
        }

        System.out.println("\nRetângulo com altura negativa:");
        try {
            FiguraGeometrica retanguloNegativoAltura = new Retangulo(-10, 5);
            System.out.println(retanguloNegativoAltura);
            System.out.println("Área: " + retanguloNegativoAltura.calcularArea());
            System.out.println("Perímetro: " + retanguloNegativoAltura.calcularPerimetro());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar retângulo: " + e.getMessage());
        }

        System.out.println("\nRetângulo com largura negativa:");
        try {
            FiguraGeometrica retanguloNegativoLargura = new Retangulo(10, -5);
            System.out.println(retanguloNegativoLargura);
            System.out.println("Área: " + retanguloNegativoLargura.calcularArea());
            System.out.println("Perímetro: " + retanguloNegativoLargura.calcularPerimetro());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar retângulo: " + e.getMessage());
        }

        System.out.println("\nQuadrado válido:");
        try {
            FiguraGeometrica quadrado = new Quadrado(7);
            System.out.println(quadrado);
            System.out.println("Área: " + quadrado.calcularArea());
            System.out.println("Perímetro: " + quadrado.calcularPerimetro());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar quadrado: " + e.getMessage());
        }

        System.out.println("\nCírculo válido:");
        try {
            FiguraGeometrica circulo = new Circulo(25);
            System.out.println(circulo);
            System.out.println("Área: " + circulo.calcularArea());
            System.out.println("Perímetro: " + circulo.calcularPerimetro());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar círculo: " + e.getMessage());
        }

        System.out.println("\nCírculo com raio negativo:");
        try {
            FiguraGeometrica circuloNegativo = new Circulo(-25);
            System.out.println(circuloNegativo);
            System.out.println("Área: " + circuloNegativo.calcularArea());
            System.out.println("Perímetro: " + circuloNegativo.calcularPerimetro());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar círculo: " + e.getMessage());
        }
    }
}
