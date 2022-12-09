package src.modell;

import java.awt.*;

public class Truck extends Car {
    private boolean canMove=true;

    // Om man kan välja vinkel på platformen
    public Truck(int doors, double power, double speed, Color color, String name, double x, double y, boolean turnLeft,
            boolean turnRight) {
        super(doors, 375, speed, color, name, x, y, turnLeft, turnRight);
        this.canMove = true;
    }

    public boolean getCanMove() {
        return this.canMove;
    }

    public void setCanMoveFalse() {
        this.canMove = false;
    }

    public void setCanMoveTrue() {
        this.canMove = true;
    }

    public double speedFactor() {
        return getEnginePower() * 0.01;
    }

    @Override 
    public void tryGas(double amount) {
        try {
            if (this.canMove) {
                gas(amount);
            } else {
                throw new Exception();
            }

        } catch (Exception e) {
            System.out.println("truck cannot move");
        }

    }
}