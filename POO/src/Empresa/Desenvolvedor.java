package Empresa;

public class Desenvolvedor extends Funcionario {
    private String linguagemPreferida;

    public Desenvolvedor(String nome, double salarioBase, String linguagemPreferida){
        super (nome, salarioBase);  // Chamando a Superclasse/mae do construtor
        this.linguagemPreferida =  linguagemPreferida;
    }

    @Override
    public double calcularBonus() {
        return getSalarioBase() * 0.10;
        }
}
