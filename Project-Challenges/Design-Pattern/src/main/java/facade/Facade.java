package facade;

import subsystem1.crm.CRMService;
import susbsystem2.cep.CEPAPI;

public class Facade {
    
    public void migrarCliente(String nome, String cep){
        String cidade = CEPAPI.getInstancia().recuperarCidade(cep);
        String estado = CEPAPI.getInstancia().recuperarEstado(cep);
        CRMService.gravarCliente(nome, cep, cidade, estado);
    }
}
