package CadastroDeFuncionariosAV;

public class Administrador extends Funcionario {

    public Administrador(String nome, String cpf, double salario){
        super(nome, cpf, salario);
    }

    public void exibirCargo() {
        System.out.println("cargo: Administrador");
    }

    public void calcularBonus() {
        double bonus = getSalario() * 0.10; //CALCULANDO BONUS
        System.out.println("bônus: R$ " + bonus);
    }
}
