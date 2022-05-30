package strategy;

import strategy.Behavior;

public class Robot {
    
    private Behavior behavior;

    public void setBehavior(Behavior behavior) {
        this.behavior = behavior;
    }
    
    public void move() {
        behavior.move();
    }
}
