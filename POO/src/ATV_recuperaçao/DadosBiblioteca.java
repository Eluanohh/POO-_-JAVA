package ATV_recuperaçao;

import java.util.Scanner;

public class DadosBiblioteca {
    static Scanner sc = new Scanner(System.in); // Criando nosso Scanner

    public static void main(String[] args) { // Criando nossa main

        Biblioteca  biblioteca1 = new Biblioteca(); // Fazendo os três cadastros

        System.out.println("Informe o titulo do livro: ");
        biblioteca1.setTitulo(sc.nextLine());
        System.out.println("Informe o autor do livro: ");
        biblioteca1.setAutor(sc.nextLine());
        System.out.println("Informe o ano do livro: ");
        biblioteca1.setAno(sc.nextInt());

        if (biblioteca1.getAno() <= 1900) { // Não deixando ser velho de mais > que o ano 1900
            throw new IllegalArgumentException("Publicação do livro ultrapassada!");

        }
        Biblioteca  biblioteca2 = new Biblioteca();

        System.out.println("Informe o titulo do livro: ");
        biblioteca2.setTitulo(sc.nextLine());
        System.out.println("Informe o autor do livro: ");
        biblioteca2.setAutor(sc.nextLine());
        System.out.println("Informe o titulo do livro: ");
        biblioteca2.setAno(sc.nextInt());

        if (biblioteca2.getAno() <= 1900) {
            throw new IllegalArgumentException("Publicação do livro ultrapassada!");

        }
        Biblioteca  biblioteca3 = new Biblioteca();

        System.out.println("Informe o titulo do livro: ");
        biblioteca3.setTitulo(sc.nextLine());
        System.out.println("Informe o autor do livro: ");
        biblioteca3.setAutor(sc.nextLine());
        System.out.println("Informe o titulo do livro: ");
        biblioteca3.setAno(sc.nextInt());

        if (biblioteca3.getAno() <= 1900) {
            throw new IllegalArgumentException("Publicação do livro ultrapassada!");

        }
    }
}
