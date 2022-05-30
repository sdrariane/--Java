package dio.gof;

import singleton.SingletonEager;
import singleton.SingletonLazy;
import singleton.SingletonLazyHolder;

import strategy.AgressiveBehavior;
import strategy.DefensiveBehavior;
import strategy.NormalBehavior;
import strategy.Robot;

import facade.Facade;

public class Test {
    public static void main(String[] args){
        
        /*SINGLETON*/
        
        /*Impressão de endereço de memoria para verificar se
        ele retorna a mesma instância*/
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        
        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);
        
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        
        /*STRATEGY*/
        
        AgressiveBehavior agressive = new AgressiveBehavior();
        NormalBehavior normal = new NormalBehavior();
        DefensiveBehavior defensive = new DefensiveBehavior();
        
        Robot bot = new Robot();
        
        bot.setBehavior(normal);
        bot.move();
        bot.move();
        
        bot.setBehavior(defensive);
        bot.move();
        
        bot.setBehavior(agressive);
        bot.move();
        
        /*FACADE*/
        Facade facade = new Facade();
        facade.migrarCliente("Venilton", "1974692864");
    }
}
