package src;
import java.awt.*;

public class Scania extends Car{
    // enginePower = 375

    private double currentPlatformAngle;
    public Scania(int doors, int power, int speed, Color color, String name, int x, int y, boolean turnLeft, boolean turnRight, double angle) {
        super(doors, 375, speed, color, name, x, y, turnLeft, turnRight);
        this.currentPlatformAngle = angle;
    }


    public double speedFactor() {
        return getEnginePower() * 0.01;
    }

    public double getCurrentPlatformAngle() {
        return this.currentPlatformAngle;
    }

    // Lowers or raises the platform depending if "angle" is negative or positive. The car has to be standing still to move the platform.
    // The range is between 70 degrees (fully lowered) and 0 degrees (fully raised).
    public void anglePlatorm(double angle) {
        double newAngle = calculateNewAngle(angle);
        if (newAngleIsInsideRange(newAngle) & scaniaIsNotMoving(getCurrentSpeed())) {
            this.currentPlatformAngle = newAngle;
        }
    }

    // Calculates the new angle based on the argument given when calling anglePlatform()
    private double calculateNewAngle(double angle) {
        if (angle > 0) {
            return Math.min(70, getCurrentPlatformAngle() + angle);

        } else if (angle < 0) {
            return Math.max(0, getCurrentPlatformAngle() + angle);

        } else { 
            return getCurrentPlatformAngle();
        }
    }

    // Returns true if the newAngle is between 70 and 0 degrees
    private boolean newAngleIsInsideRange(double newAngle) {
        return (newAngle <= 70 || newAngle+this.currentPlatformAngle>=0);
    }

    // Returns true if the car is not moving
    private boolean scaniaIsNotMoving(double speed) {
        return (speed == 0);
    }

    @Override
    public void gas(double amount) {
        try {
            if ((amount <= 0 || amount >= 1) || (getCurrentPlatformAngle() > 0)) {
                throw new Exception();
            } else {
                incrementSpeed(amount);
            }

        } catch (Exception e) {
            System.out.println("impossible amount");
        }
    }

}
