package br.com.fiapride.model;

public class Rota {
    
    private Pacote pacote;
    private Veiculo veiculoUtilizado;

    public Rota(Pacote pacote, Veiculo veiculoUtilizado) {
        this.pacote = pacote;
        this.veiculoUtilizado = veiculoUtilizado;
    }

    public Pacote getPacote() { return pacote; }
    public void setPacote(Pacote pacote) { this.pacote = pacote; }

    public Veiculo getVeiculoUtilizado() { return veiculoUtilizado; }
    public void setVeiculoUtilizado(Veiculo veiculoUtilizado) { this.veiculoUtilizado = veiculoUtilizado; }

    public void iniciarEntrega() {
        System.out.println("Iniciando entrega...");
        System.out.println("Pacote: " + pacote.getCodigo() + " | Status: " + pacote.getStatus());
        System.out.println("Veículo designado (Placa): " + veiculoUtilizado.getPlaca());
        
        if (veiculoUtilizado.getGasolina() < 10.0) {
            System.out.println("ALERTA: Nível de gasolina baixo para esta rota!");
        } else {
            System.out.println("Veículo liberado para a rota. Boa viagem!");
        }
        System.out.println("-------------------------------------------------");
    }
}