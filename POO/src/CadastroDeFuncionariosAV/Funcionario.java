package CadastroDeFuncionariosAV;

public abstract class Funcionario {
    private String nome; //ENCAPSULAMENTO
    private String cpf;
    private double salario;

    public Funcionario(String nome, String cpf, double salario){
        this.nome = nome;// CONSTRUTOR
        this.cpf = cpf;
        this.salario = salario;
    }
    //ENCAPSULAMENTO
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public abstract void exibirCargo();
    public abstract void calcularBonus();

    public void exibirInformacoes() {
        System.out.println("nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("salario: R$ " + salario);
    }
}
