package MobilidadeUrbanaAV;

public class Carro extends Transporte {

    public Carro(String nome, int velocidadeMax, int autonomia, String tipoDeCombustivel){
        super(nome, velocidadeMax, autonomia, tipoDeCombustivel);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public int getVelocidadeMax() {
        return super.getVelocidadeMax();
    }

    @Override
    public void setVelocidadeMax(int velocidadeMax) {
        super.setVelocidadeMax(velocidadeMax);
    }

    @Override
    public int getAutonomia() {
        return super.getAutonomia();
    }

    @Override
    public void setAutonomia(int autonomia) {
        super.setAutonomia(autonomia);
    }

    @Override
    public String getTipoDeCombustivel() {
        return super.getTipoDeCombustivel();
    }

    @Override
    public void setTipoDeCombustivel(String tipoDeCombustivel) {
        super.setTipoDeCombustivel(tipoDeCombustivel);
    }

    @Override
    public void mover() {

    }

    @Override
    public void parar() {

    }

    @Override
    public void exibirinformacoes() {
        super.exibirinformacoes();
    }
}
