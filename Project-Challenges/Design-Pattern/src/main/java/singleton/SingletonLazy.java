package singleton;

public class SingletonLazy {
    
    private static SingletonLazy instancia;
    
    /*ele não disponibiliza a instância para o uuário
    garantindo que ninguém externamente o instancie*/
    private SingletonLazy() { super(); }
    
    /*retornar uma instância dele mesmo o qual não é 
    disponibilizada para o usuário*/
    public static SingletonLazy getInstancia(){
        if (instancia == null){
          instancia = new SingletonLazy();  
        }
        return instancia;
    }

}
