package src.modell;

import java.awt.*;

public class Truck extends Car {
    private boolean canMove;

    // Om man kan välja vinkel på platformen
    public Truck(int doors, double power, double speed, Color color, String name, double x, double y, boolean turnLeft,
            boolean turnRight) {
        super(doors, 375, speed, color, name, x, y, turnLeft, turnRight);
        this.canMove = false;
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
    public void gas(double amount) {
        try {
            if (canMove==true) {
                super.gas(amount);
            } else {
                throw new Exception();
            }

        } catch (Exception e) {
            System.out.println("truck cannot move");
        }

    }
}