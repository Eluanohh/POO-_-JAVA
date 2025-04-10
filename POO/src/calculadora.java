import java.util.Scanner;

public class calculadora {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double num1, num2;
        int tipoCalculo;

        System.out.println('Bem vindo ao programa Calculadora!');
        System.out.println("Escreva o primeiro valor:  ");
        num1 = sc.nextDouble();
        System.out.println("Escreva o segundo valor:  ");
        num2 = sc.nextDouble();
        System.out.println("opçoes de calculo:  ");
        System.out.println("1 - Adiçao");
        System.out.println("2 - Subtraçao");
        System.out.println("3 - Multiplicaçao");
        System.out.println("4 - Divisao");
        System.out.println("Escolha: ");
        tipoCalculo = sc.nextInt();

        if (tipoCalculo == 1) {
            System.out.println("o resultado e: " + (num1 + num2));
        }
    }
}
