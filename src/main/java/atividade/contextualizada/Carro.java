package atividade.contextualizada;

public class Carro extends Veiculo implements Manutencao {
    private final int numeroPortas;

    public Carro(String placa, int ano, int numeroPortas) {
        super(placa, ano);
        this.numeroPortas = numeroPortas;
    }

    @Override
    public double calcularValorSeguro() {
        return 500.0 + (50.0 * numeroPortas);
    }

    @Override
    public String realizarManutencao() {
        return "Manutenção realizada para o carro com " + numeroPortas + " portas.";
    }
}