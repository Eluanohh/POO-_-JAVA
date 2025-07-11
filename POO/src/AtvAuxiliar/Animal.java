package AtvAuxiliar;

abstract class Animal {
    private String nome;
    private int idade;


    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade < 0){
            throw new IllegalArgumentException("Nao ha idade negativa");
        }
        this.idade = idade;

    }
    public abstract void emitirSom();
    public abstract void comer();
    public abstract void exibirInformacoes();
}
