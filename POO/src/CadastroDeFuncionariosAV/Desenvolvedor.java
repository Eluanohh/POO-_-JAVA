package CadastroDeFuncionariosAV;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, String cpf, double salario){
        super(nome, cpf, salario);
    }

    public void exibirCargo() {
        System.out.println("cargo: desenvolvedor");
    }

    public void calcularBonus() {
        double bonus = getSalario() * 0.15;
        System.out.println("bonus: R$ " + bonus);
    }
}

