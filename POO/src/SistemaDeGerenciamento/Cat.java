package SistemaDeGerenciamento;

public class Cat extends Animal {
    private String corPelo;

    public Cat(String nome, int idade, String corPelo) {
        super(nome, idade);
        this.corPelo = corPelo;

    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public void emitirSom() {
        System.out.println("Meow, meoow");
    }

    @Override
    public void comer() {
        System.out.println("Ração para gato, de acordo com sua idade");
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade() + " anos");
        System.out.println("Cor do pelo: " + getCorPelo());
    }
}
