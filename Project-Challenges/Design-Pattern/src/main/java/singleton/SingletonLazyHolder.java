package singleton;

/*possui consumo e uso de memória mais otimizados, por encapsular
a instancia em uma classe estática interna que será chamado de 
InstanceHolder - inner class*/
public class SingletonLazyHolder {
    
    private static class InstanceHolder {
     public static SingletonLazyHolder instancia = new SingletonLazyHolder();   
    }
    
    private SingletonLazyHolder() { super(); }

    public static SingletonLazyHolder getInstancia(){
        return InstanceHolder.instancia;
    }
    
}
