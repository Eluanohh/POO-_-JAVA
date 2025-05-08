package CalculadoraGeometrica;

public class Retangulo extends FormaGeometrica {
    private double largura;
    private double altura;
    private double comprimento;

    public Retangulo(String cor, double largura, double altura) {
        super(cor);
        this.largura = largura;
        this.altura = altura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calculoArea() {
        return this.altura * this.largura;
    }

    @Override
    public double calculoPerimetro() {
        return (this.largura + this.altura) * 2;
    }

    @Override
    public double calculoVolume() {
        return (this.largura * this.comprimento) * this.altura;
    }
}

