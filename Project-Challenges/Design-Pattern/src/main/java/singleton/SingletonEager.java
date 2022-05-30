package singleton;

/*no momento em que a classe é aciona a instância é atribuída
automaticamente paa ser chamada*/
public class SingletonEager {
    /*logo no momento que a variável estática é definida
    ele atribui a instancia*/
    private static SingletonEager instancia = new SingletonEager();
    
    /*ele não disponibiliza a instância para o uuário
    garantindo que ninguém externamente o instancie*/
    private SingletonEager() { super(); }
    
    /*retornar uma instância dele mesmo o qual não é 
    disponibilizada para o usuário*/
    public static SingletonEager getInstancia(){
        return instancia;
    } 
}
