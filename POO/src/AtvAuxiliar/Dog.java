package AtvAuxiliar;

public class Dog extends Animal{
    private String raca;

    public Dog( String nome, int idade, String raca){
        super(nome, idade);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Dog(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void emitirSom() {
        System.out.println("auuuuu");
    }

    @Override
    public void comer() {
        System.out.println("dog comendo ");
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("pinvherbu");
    }
}
