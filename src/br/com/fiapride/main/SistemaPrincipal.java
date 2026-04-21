package br.com.fiapride.main;

import br.com.fiapride.model.Caminhao;
import br.com.fiapride.model.Moto;
import br.com.fiapride.model.Pacote;
import br.com.fiapride.model.Rota;

public class SistemaPrincipal {
    public static void main(String[] args) {
        System.out.println("========== SISTEMA FIAP DELIVERY ==========\n");

        Pacote pacote1 = new Pacote("CERT-B3-001", 10.5, "Pendente - Balcão");
        Pacote pacote2 = new Pacote("URG-002", 2.5, "Expresso");

        Caminhao caminhao = new Caminhao("ABC-1234", 5000.0, 150.0, 4);
        Moto moto = new Moto("XYZ-9876", 30.0, 15.0, true);

        System.out.println("---------- Teste de Segurança ----------");
        System.out.println("Tentando definir capacidade negativa no caminhão...");
        caminhao.setCapacidade(-500.0); 
        System.out.println("Capacidade atual do caminhão: " + caminhao.getCapacidade() + " kg\n");

        System.out.println("---------- Alocando Rotas ----------");
        
        Rota rota1 = new Rota(pacote1, caminhao);
        rota1.iniciarEntrega();

        Rota rota2 = new Rota(pacote2, moto);
        rota2.iniciarEntrega();
        
        System.out.println("---------- Teste de Validação de Combustível ----------");
        Moto motoSemGasolina = new Moto("AAA-1111", 20.0, 2.0, false);
        Pacote pacote3 = new Pacote("NOR-003", 1.0, "Pendente");
        
        Rota rota3 = new Rota(pacote3, motoSemGasolina);
        rota3.iniciarEntrega();
    }
}