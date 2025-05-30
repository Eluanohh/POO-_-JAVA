package SistemaDeGerenciamento;

public class Dog extends Animal {
    private String raca;

    public Dog(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }

    @Override
    public void comer() {
        System.out.println("O cachorro está comendo ração.");
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade() + " anos");
        System.out.println("Raça: " + getRaca());
    }
}
