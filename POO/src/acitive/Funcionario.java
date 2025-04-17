package acitive;

public class Funcionario {
    private String nome;
    private String salario;
    private String cargo;

    public Funcionario(String nome, String salario, String cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public Funcionario() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public  String getSalario() {
        return salario;
    }

    public void setSalario( String salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome: " + nome + '\'' +
                ", salario: " + salario +
                ", cargo: " + cargo + '\'' +
                '}';
    }
}


