package Empresa;


import java.util.ArrayList;

public class FolhaDePagamento {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Desenvolvedor("Eluan", 8000, "Java"));
        funcionarios.add(new Estagiario("Davi", 3000, 20));
        funcionarios.add(new Gerente("Enzo", 10000,5 ));

        for (Funcionario funcionario : funcionarios) {
            System.out.println("Funcionário: " + funcionario.getNome());
            System.out.println("Bõnus: R$ " + funcionario.calcularBonus());
            System.out.println("----------------");
        }
    }
}