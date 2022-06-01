package com.company.models;

import com.company.models.CalculaBonificacao;
import com.company.models.FuncionarioCLT;

public class Vendedor extends FuncionarioCLT implements CalculaBonificacao {

    private Double valorDaBonificacao;

    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco +
                ", valorDaBonificacao=" + valorDaBonificacao +
                '}';
    }

    @Override
    public void calculaBonificacao(Double porcentagemBonificacao) {
        this.valorDaBonificacao = this.valorSalario * (porcentagemBonificacao/100);
    }
}
