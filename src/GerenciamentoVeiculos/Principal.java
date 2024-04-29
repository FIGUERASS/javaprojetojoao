package GerenciamentoVeiculos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    private static List<Veiculos> listaVeiculos = new ArrayList<>();
    private static Scanner leitura = new Scanner(System.in);

    private static void adicionarLista(Veiculos veiculos) {
        listaVeiculos.add(veiculos);
    }

    private static void editarLista(int index, Veiculos veiculos) {
        listaVeiculos.set(index, veiculos);
    }

    private void removerDaLista(int index) {
        listaVeiculos.remove(index);
    }


    public static void main(String[] args) {
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("Digite\n" +
                    "1-Carro\n" +
                    "2-Moto\n" +
                    "3-Caminhao");
            opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {
                case 1:
                    String marca = leitura.nextLine();
                    String modelo = leitura.nextLine();
                    int ano = leitura.nextInt();
                    leitura.nextLine();
                    String tipoCombustivel = leitura.nextLine();
                    Carro carro = new Carro(marca, modelo, ano, tipoCombustivel);
                    Principal.adicionarLista(carro);
                    listaVeiculos.forEach(System.out::println);
                    break;

                case 2:
                    int i = 0;
                    for (Veiculos veiculo : listaVeiculos) {
                        System.out.println(veiculo.toString() + " " + i++);
                    }
                    int indice = leitura.nextInt();
                    leitura.nextLine();
                    editarLista(indice,  new Carro("Macaco", "Macaquito", 2003, "Agua"));
                    break;
            }
        }
    }
}
