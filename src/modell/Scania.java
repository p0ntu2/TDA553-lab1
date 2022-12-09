package src.modell;

import java.awt.*;

public class Scania extends Truck {
    private double currentAngle;
    private double maxAngle;

    public Scania(int doors, int power, int speed, Color color, String name, int x, int y, boolean turnLeft, boolean turnRight, double angle, double maxAngle) {
        super(doors, 375, speed, color, name, x, y, turnLeft, turnRight);
        this.currentAngle = angle;
        this.maxAngle = maxAngle;
        checkIfitCanMove();
    }

    public double getMaxAngle() {
        return this.maxAngle;
    }

    public double getcurrentAngle() {
        return this.currentAngle;
    } 

    // Lowers or raises the platform depending if "angle" is negative or positive. The car has to be standing still to move the platform.
    // The range is between 0 degrees (fully raised) and 70 degrees (fully lowered).
    public void anglePlatform(double angle) {
        double newAngle = calculateNewAngle(angle);
        if (newAngleIsInsideRange(newAngle) & ScaniaIsNotMoving(getCurrentSpeed())) {
            currentAngle = newAngle;
            checkIfitCanMove();
        }
    }

    // Calculates the new angle based on the argument given when calling anglePlatform()
    private double calculateNewAngle(double angle) {
        if (angle > 0) {
            return Math.min(maxAngle, currentAngle + angle);

        } else if (angle <= 0) {
            return Math.max(0, currentAngle + angle);

        } else { 
            return currentAngle;
        }
    }

    // Returns true if the newAngle is between 70 and 0 degrees
    private boolean newAngleIsInsideRange(double newAngle) {
        return (newAngle <= maxAngle || newAngle+currentAngle>=0);
    }

    // Returns true if the car is not moving
    public boolean ScaniaIsNotMoving(double speed) {
        return (speed == 0);
    }

    private void checkIfitCanMove() {
        if (this.currentAngle > 0) {
            setCanMoveFalse();
        } else {
            setCanMoveTrue();
        }
    }
}