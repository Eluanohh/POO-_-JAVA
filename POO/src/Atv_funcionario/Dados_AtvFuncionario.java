package Atv_funcionario;

import java.util.Scanner;

public class Dados_AtvFuncionario {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Atv_Funcionario atividade1 = new Atv_Funcionario();
        Atv_Funcionario atividade2 = new Atv_Funcionario();

        System.out.println("Nome do funcionario um: ");
        atividade1.setNome(sc.next());
        System.out.println("Matricula do primeiro funcionario: ");
        atividade1.setMatricula(sc.nextInt());
        System.out.println("Salario do primeiro funcionario: ");
        atividade1.setSalario(sc.nextBigDecimal());

        System.out.println("Nome do funcionario dois: ");
        atividade1.setNome(sc.next());
        System.out.println("Matricula do segundo funcionario: ");
        atividade1.setMatricula(sc.nextInt());
        System.out.println("Salario do segundo funcionario: ");
        atividade1.setSalario(sc.nextBigDecimal());

        if (atividade1.getMatricula() <= 0) {
            throw new IllegalArgumentException("a matricula deve ser maior que zero");

        }
    }
}
