package MobilidadeUrbanaAV;

abstract class Transporte {//CLASSE ABSTRATA
    private String nome;
    private int velocidadeMax;// ENCAPSULAMENTO
    private int autonomia;
    private String tipoDeCombustivel;

    public Transporte(String nome, int velocidadeMax, int autonomia, String tipoDeCombustivel){
        this.nome = nome;//CONSTRUTOR
        this.velocidadeMax = velocidadeMax;
        this.autonomia = autonomia;
        this.tipoDeCombustivel = tipoDeCombustivel;
    }
    // ENCAPSULAMENTO
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(int velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public String getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }

    public void setTipoDeCombustivel(String tipoDeCombustivel) {
        this.tipoDeCombustivel = tipoDeCombustivel;
    }
//METODOS
    public abstract void mover();
    public abstract void parar();
    public void exibirinformacoes() {
        System.out.printf("nome do transporte: " + nome );
        System.out.println(" velocidade maxima: " + velocidadeMax);
        System.out.println("autonomia: " + autonomia);
        System.out.println(" tipo de combustivel usado no veiculo" + tipoDeCombustivel);
    }
}


