package br.edu.ads.usj.calculadorahistorico;

import java.util.ArrayList;
import java.util.List;

public class Historico {
    // abaixo é criado uma lista só com tipo string; listaOperacoes é a variavel string do tipo list de strings
    // new ArrayList inicia a variavel listaOperacoes
    List<String> listaOperacoes = new ArrayList<>();
    
    void adicionar(String operacao) {
        // abaixo é adicionado operacao para a listaOperacoes que é uma lista de array
        listaOperacoes.add(operacao);
    }

    List<String> lerOperacoes() {
        return listaOperacoes;
    }
}