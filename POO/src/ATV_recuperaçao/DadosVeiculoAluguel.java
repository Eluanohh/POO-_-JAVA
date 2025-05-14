package ATV_recuperaçao;

import java.util.Scanner;

public class DadosVeiculoAluguel {
    // Atributos privados (encapsulamento)
    private String modelo;
    private String placa;
    private double quilometragem;

    // Construtor com validação
    public DadosVeiculoAluguel(String modelo, String placa, double quilometragem) {
        this.modelo = modelo;
        this.placa = placa;
        if (quilometragem < 0) {
            throw new IllegalArgumentException("A quilometragem não pode ser negativa.");
        }
        this.quilometragem = quilometragem;
    }

    public String getDadosVeiculoAluguel() {
        return "Modelo: " + modelo + ", Placa: " + placa + ", Quilometragem: " + quilometragem + " km";
    }

    public void setQuilometragem(double novaQuilometragem) {
        if (novaQuilometragem < 0) {
            System.out.println("Erro: A quilometragem não pode ser negativa.");
        } else {
            this.quilometragem = novaQuilometragem;
        }
    }

    // Método pricipal main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o modelo do veículo: ");
        String modelo = sc.nextLine();
        System.out.print("Digite a placa do veículo: ");
        String placa = sc.nextLine();
        System.out.print("Digite a quilometragem do veículo: ");
        double km = sc.nextDouble();

        try {
            DadosVeiculoAluguel veiculo = new DadosVeiculoAluguel(modelo, placa, km);
            System.out.println("Dados do veículo:");
            System.out.println(veiculo.getDadosVeiculoAluguel());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar veículo: " + e.getMessage());
        }

        sc.close();
    }
}



