package acitive;

import java.util.Scanner;

public class COMANDOS_BASICOS {
    static Scanner sc = new Scanner(System.in); // isso aqui e um prompt
    public static void main(String[] args) {
        //variaveis de tipos primitivos
        boolean TrueOrFalse = true;
        int numeroReais = 0; // 10000000000 a -10000000000
        double decimais = 0.2; // 10000.200 a -10000.400
        char letra = 'A';

        // variavel tipo objeto
        String texto = "Texto";
        Integer numerosReais2 = 2; // inteiro do tipo objeto
        Double decimasi2 = 0.2; // decimal do tipo objeto

        String nome = null; // nulo == " "
        String sexo = " ";


        System.out.println("qual seu nome?");
        nome = sc.nextLine(); // leia - escreva na variavel nome

        System.out.println("o seu nome é " + nome);
    }
}