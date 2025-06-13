package CadastroDeFuncionariosAV;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("cadastro de Administrador:");
        System.out.print("nome: ");
        String nome1 = sc.nextLine();
        System.out.print("CPF (11 dígitos): ");
        String cpf1 = sc.nextLine();
        System.out.print("salario: ");
        double salario1 = Double.parseDouble(sc.nextLine());
        Funcionario administrador = new Administrador(nome1, cpf1, salario1);

        System.out.println("\ncadastro de Desenvolvedor:");
        System.out.print("Nome: ");
        String nome2 = sc.nextLine();
        System.out.print("CPF (11 dígitos): ");
        String cpf2 = sc.nextLine();
        System.out.print("salario: ");
        double salario2 = Double.parseDouble(sc.nextLine());
        Funcionario desenvolvedor = new Desenvolvedor(nome2, cpf2, salario2);

        System.out.println("\ncadastro de Suporte Tecnico:");
        System.out.print("nome: ");
        String nome3 = sc.nextLine();
        System.out.print("CPF (11 dígitos): ");
        String cpf3 = sc.nextLine();
        System.out.print("salario: ");
        double salario3 = Double.parseDouble(sc.nextLine());
        Funcionario suporte = new SuporteTecnico(nome3, cpf3, salario3);


        System.out.println("\nfuncionarios\n");

        administrador.exibirCargo();
        administrador.exibirInformacoes();
        administrador.calcularBonus();

        System.out.println();

        desenvolvedor.exibirCargo();
        desenvolvedor.exibirInformacoes();
        desenvolvedor.calcularBonus();

        System.out.println();

        suporte.exibirCargo();
        suporte.exibirInformacoes();
        suporte.calcularBonus();

    }
}
