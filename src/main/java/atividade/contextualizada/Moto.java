package atividade.contextualizada;

public class Moto extends Veiculo implements Manutencao {
    private final int cilindrada;

    public Moto(String placa, int ano, int cilindrada) {
        super(placa, ano);
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularValorSeguro() {
        return 300.0 + (cilindrada * 0.1);
    }

    @Override
    public String realizarManutencao() {
        return "Manutenção realizada para a moto com " + cilindrada + " cilindradas.";
    }
}