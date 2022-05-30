package strategy;

import strategy.Behavior;

public class AgressiveBehavior implements Behavior {

    @Override
    public void move() {
        System.out.println("Agressive moving...");
    }
    
}
