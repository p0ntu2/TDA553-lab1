package src;

public class Platform {

    private int maxAngle;
    private double currentPlatformAngle;
    private boolean platformUp;

    public Platform(int maxAngle, double angle) {
        this.maxAngle = maxAngle;
        this.currentPlatformAngle = angle;
    }

    public Platform(boolean platformUp) {
        this.platformUp = platformUp;
    }

    public int getMaxAngle() {
        return this.maxAngle;
    }

    public double getCurrentPlatformAngle() {
        return this.currentPlatformAngle;
    } 

    // Lowers or raises the platform depending if "angle" is negative or positive. The car has to be standing still to move the platform.
    // The range is between 70 degrees (fully raised) and 0 degrees (fully lowered).
    public void anglePlatorm(double angle, boolean CarisNotMoving) {
        double newAngle = calculateNewAngle(angle);
        if (newAngleIsInsideRange(newAngle) & CarisNotMoving) {
            currentPlatformAngle = newAngle;
        
        } else if (platformUp) {
            platformUp = false;
       
        } else {
            platformUp = true;
        }
    }



    // Calculates the new angle based on the argument given when calling anglePlatform()
    private double calculateNewAngle(double angle) {
        if (angle > 0) {
            return Math.min(maxAngle, currentPlatformAngle + angle);

        } else if (angle < 0) {
            return Math.max(0, currentPlatformAngle + angle);

        } else { 
            return currentPlatformAngle;
        }
    }

    // Returns true if the newAngle is between 70 and 0 degrees
    private boolean newAngleIsInsideRange(double newAngle) {
        return (newAngle <= maxAngle || newAngle+currentPlatformAngle>=0);
    }
}