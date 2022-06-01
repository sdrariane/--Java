package com.company.models;

import com.company.models.CalculaBonificacao;
import com.company.models.FuncionarioPJ;

public class Gerente extends FuncionarioPJ implements CalculaBonificacao {

    private Double valorDeBonificacao;

    @Override
    public String toString() {
        return "FuncionarioPJ{" +
                "nome='" + super.getNome() + '\'' +
                ", documento='" + super.getDocumento() + '\'' +
                ", endereco=" + super.getEndereco().getRua() +
                ", horasTrabalhadas=" + super.getHorasTrabalhadas() +
                ", valorHora=" + super.getValorHora() +
                ", valorRemuneracao=" + super.getValorRemuneracao() +
                ", valorBonificacao=" + this.valorDeBonificacao +
                '}';
    }

    @Override
    public void calculaBonificacao(Double porcentagemBonificacao) {
        this.valorDeBonificacao = (super.getValorRemuneracao() * (porcentagemBonificacao/100)) + 100d;
    }
}
