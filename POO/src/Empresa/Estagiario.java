package Empresa;

public class Estagiario extends Funcionario {
    private double horasEstagio;

    public Estagiario(String nome, double salarioBase, double horasEstagio){
        super (nome, salarioBase);  // Chamando a Superclasse/mae do construtor
        this.horasEstagio = horasEstagio;
    }

    @Override
    public double calcularBonus() {
        return getSalarioBase() * 0.05;
    }
}
