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

    public void incrementSpeed(double amount) {
        try {
            if (getCurrentSpeed() >= getEnginePower()) {
                throw new Exception();
            } else {
                setCurrentSpeed(getCurrentSpeed() + speedFactor() * amount);
            }

        } catch (Exception e) {
            System.out.println("the car is already at max speed");
            setCurrentSpeed(getEnginePower());
        }
    }

    public void decrementSpeed(double amount) {
        try {
            if (getCurrentSpeed() <= 0) {
                throw new Exception();
            } else {
                setCurrentSpeed(getCurrentSpeed() - speedFactor() * amount);
            }

        } catch (Exception e) {
            System.out.println("the car is already still");
            setCurrentSpeed(0);
        }
    }

    private double getCurrentPlatformAngle() {
        return this.currentPlatformAngle;
    }
    public void anglePlatorm(double angle) {
        double newAngle = calculateNewAngle(angle);
        if (newAngleIsInsideRange(newAngle)) {
            this.currentPlatformAngle = newAngle;
        }
    }

    private boolean newAngleIsInsideRange(double newAngle) {
        return (newAngle <= 70 || newAngle+this.currentPlatformAngle>=0);

    }
    private double calculateNewAngle(double angle) {
        if (angle > 0) {
            return getCurrentPlatformAngle() + 5;

        } else if (angle < 0) {
            return getCurrentPlatformAngle() - 5;

        } else { 
            return getCurrentPlatformAngle();
        }
    }

}
