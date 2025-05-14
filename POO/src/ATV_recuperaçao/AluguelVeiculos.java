package ATV_recuperaçao;

public class AluguelVeiculos {
    private String modelo;
    private String placa;
    private double quilometragem;

    AluguelVeiculos (String modelo, String placa, double quilometragem){
        this.modelo = modelo;
        this.placa = placa;
        this.quilometragem = quilometragem;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getquilometragem() {
        return quilometragem;
    }

    public void setKilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    @Override
    public String toString() {
        return "AluguelVeiculos{" +
                "modelo='" + modelo + '\'' +
                ", placa='" + placa + '\'' +
                ", quilometragem=" + quilometragem +
                '}';
    }
}
