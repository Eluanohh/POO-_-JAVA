package CalculadoraGeometrica;


import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Bem vindo ao sistema de Calculadora de Formas Geometricas");
        System.out.println("Qual forma voce deseja usar?");
        System.out.println(
                "Opçoes: \n" +
                "1. Quadrado\n" +
                "2. Retangulo");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1: {
                System.out.println("digite a cor do quadrado: ");
                String cor = sc.next();
                System.out.println("Digite o lado do quadrado: ");
                double lado = sc.nextDouble();

                Quadrado quadrado = new Quadrado(cor, lado);

                System.out.println("Perimetro: " + quadrado.calculoPerimetro());
                System.out.println("Area: " + quadrado.calculoArea());
                System.out.println("Volume: " + quadrado.calculoVolume());

                break;
            }
        }
    }
}
