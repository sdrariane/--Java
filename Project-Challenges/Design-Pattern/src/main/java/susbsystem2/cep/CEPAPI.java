package susbsystem2.cep;

public class CEPAPI {
    
    private static CEPAPI instancia = new CEPAPI();
    
    private CEPAPI() { super(); }
    
    public static CEPAPI getInstancia() {
        return instancia;
    }
    
    public String recuperarCidade(String cep){
        return "Araraquara";
    }
    
    public String recuperarEstado(String cep){
        return "SP";
    }
}
