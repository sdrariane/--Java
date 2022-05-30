package strategy;

import strategy.Behavior;

public class DefensiveBehavior implements Behavior {

    @Override
    public void move() {
        System.out.println("Defensive moving...");
    }
    
}
