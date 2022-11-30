package src;
import java.awt.*;

public class Platform {

    private int maxAngle;
    private double currentPlatformAngle;
    
    public Platform(int maxAngle, double angle) {
        this.maxAngle = maxAngle;
        this.currentPlatformAngle = angle;
    }

    // Lowers or raises the platform depending if "angle" is negative or positive. The car has to be standing still to move the platform.
    // The range is between 70 degrees (fully raised) and 0 degrees (fully lowered).
    public void anglePlatorm(double angle, boolean isNotMoving) {
        double newAngle = calculateNewAngle(angle);
        if (newAngleIsInsideRange(newAngle) & isNotMoving) {
            setPlatformAngle(newAngle);
        }
    }

    // Calculates the new angle based on the argument given when calling anglePlatform()
    private double calculateNewAngle(double angle) {
        if (angle > 0) {
            return Math.min(this.maxAngle, getCurrentPlatformAngle() + angle);

        } else if (angle < 0) {
            return Math.max(0, getCurrentPlatformAngle() + angle);

        } else { 
            return getCurrentPlatformAngle();
        }
    }

    // Returns true if the newAngle is between 70 and 0 degrees
    private boolean newAngleIsInsideRange(double newAngle) {
        return (newAngle <= this.maxAngle || newAngle+getCurrentPlatformAngle()>=0);
    }

    public int getMaxAngle() {
        return this.maxAngle;
    }

    public double getCurrentPlatformAngle() {
        return this.currentPlatformAngle;
    }

    private void setPlatformAngle(double newAngle) {
        this.currentPlatformAngle = newAngle;
    }
}
