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

    public void anglePlatorm(double angle) {
        double newAngle = calculateNewAngle(angle);
        if (newAngleIsInsideRange(newAngle) & scaniaIsNotMoving(getCurrentSpeed())) {
            this.currentPlatformAngle = newAngle;
        }
    }

    private double calculateNewAngle(double angle) {
        if (angle > 0) {
            return Math.min(70, getCurrentPlatformAngle() + angle);

        } else if (angle < 0) {
            return Math.max(0, getCurrentPlatformAngle() + angle);

        } else { 
            return getCurrentPlatformAngle();
        }
    }

    private boolean newAngleIsInsideRange(double newAngle) {
        return (newAngle <= 70 || newAngle+this.currentPlatformAngle>=0);
    }

    private boolean scaniaIsNotMoving(double speed) {
        return (speed == 0);
    }
}
