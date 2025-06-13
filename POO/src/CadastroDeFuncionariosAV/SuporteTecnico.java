package CadastroDeFuncionariosAV;

public class SuporteTecnico extends Funcionario {

    public SuporteTecnico(String nome, String cpf, double salario){
        super(nome, cpf, salario);
    }

    public void exibirCargo() {
        System.out.println("cargo: Suporte Técnico");
    }

    public void calcularBonus() {
        double bonus = getSalario() * 0.08;
        System.out.println("bonus: R$ " + bonus);
    }
}
