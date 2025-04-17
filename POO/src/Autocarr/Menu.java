package Autocarr;

import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int quantidadeRodas;
        String chassi;
        String marca;
        String tipo;

        Veiculo veiculo = new Veiculo();

                System.out.println("quantidade de rodas: ");
        veiculo.setQuantidadeRodas(sc.nextInt());
        System.out.println("chassi: ");
        veiculo.setChassi(sc.next());
        System.out.println("marca: ");
        marca = sc.next();
        System.out.println("tipo: ");
        tipo = sc.next();



        veiculo.setMarca(marca);
        veiculo.setTipo(tipo);





        System.out.println(veiculo.toString());
    }
}
