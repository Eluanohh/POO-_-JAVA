package Empresa;

public class Gerente extends Funcionario {
    private double projetosGerenciados;


        public Gerente (String nome, double salarioBase, double projetosGerenciados) {
        super(nome, salarioBase);                 //Chamando o contrutor da classe mae/Superclasse.
        this.projetosGerenciados = projetosGerenciados;
    }

    @Override
    public double calcularBonus() {
        return getSalarioBase() * 0.15;
    }

}
