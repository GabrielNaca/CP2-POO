package br.com.fiapride.model;

public class Veiculo {
    
    private String placa;
    private double capacidade;
    private double gasolina;

    public Veiculo(String placa, double capacidade, double gasolina) {
        this.placa = placa;
        this.capacidade = capacidade;
        this.gasolina = gasolina;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        if (capacidade >= 0) {
            this.capacidade = capacidade;
        } else {
            System.out.println("Erro Crítico: A capacidade de carga não pode ser negativa!");
        }
    }

    public double getGasolina() {
        return gasolina;
    }

    public void setGasolina(double gasolina) {
        if (gasolina >= 0) {
            this.gasolina = gasolina;
        } else {
            System.out.println("Erro Crítico: O nível de gasolina não pode ser negativo!");
        }
    }
}