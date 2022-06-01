package com.company;

import com.company.models.Endereco;
import com.company.models.Gerente;
import com.company.models.OperadorDeCaixa;
import com.company.models.Vendedor;

public class Main {

    public static void main(String[] args) {

        /*Endereco endereco = new Endereco();
        endereco.setRua("Endereço");
        System.out.println(endereco.getRua());*/

        Endereco endereco = new Endereco("Rua funcionário", "complemento", "bairro");

        Vendedor vendedor = new Vendedor();

        vendedor.setNome("Camila");
        vendedor.setDocumento("44878037806");
        vendedor.setValorSalario(1200d);
        vendedor.setEndereco(endereco);

        vendedor.calculaBonificacao(2d);

        OperadorDeCaixa operadorDeCaixa = new OperadorDeCaixa("Camila Op Caixa", "9999999999999", 2000d, endereco);

        Gerente gerente = new Gerente();
        gerente.setNome("Paulo");
        gerente.setDocumento("99999999999");
        gerente.setEndereco(endereco);
        gerente.setHorasTrabalhadas(20);
        gerente.setValorHora(100d);

        gerente.calculaRemuneracao();
        gerente.calculaBonificacao(3d);

    }
}
