package atividade.contextualizada;

import java.util.ArrayList;

public class GerenciadorVeiculos {
    public static void main(String[] args) {
        ArrayList<Veiculo> listaVeiculos = new ArrayList<>();

        // Adicionando veículos à lista
        listaVeiculos.add(new Carro("ABC1234", 2020, 4));
        listaVeiculos.add(new Moto("XYZ5678", 2018, 250));

        // Percorrendo a lista e exibindo detalhes
        for (Veiculo veiculo : listaVeiculos) {
            veiculo.exibirDetalhes();
            System.out.printf("Valor do Seguro: R$ %.2f%n", veiculo.calcularValorSeguro());
            if (veiculo instanceof Manutencao) {
                System.out.println(((Manutencao) veiculo).realizarManutencao());
            }
            System.out.println("----------------------------");
        }
    }
}