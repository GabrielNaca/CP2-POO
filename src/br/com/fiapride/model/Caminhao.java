package br.com.fiapride.model;

public class Caminhao extends Veiculo {
    
    private int quantidadeEixos;

    public Caminhao(String placa, double capacidade, double gasolina, int quantidadeEixos) {
        super(placa, capacidade, gasolina); 
        this.quantidadeEixos = quantidadeEixos;
    }

    public int getQuantidadeEixos() {
        return quantidadeEixos;
    }

    public void setQuantidadeEixos(int quantidadeEixos) {
        this.quantidadeEixos = quantidadeEixos;
    }
}
