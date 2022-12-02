package src;
import java.awt.*;

public class Truck extends Car {

    private Platform platform;

    // Om man kan välja vinkel på platformen
    public Truck(int doors, int power, int speed, Color color, String name, int x, int y, boolean turnLeft, boolean turnRight, double angle, int maxAngle) {
        super(doors, 375, speed, color, name, x, y, turnLeft, turnRight);
        this.platform = new Platform(maxAngle, angle);
    }

    // Om platformen endast kan vara uppe eller nere
    public Truck(int doors, int power, int speed, Color color, String name, int x, int y, boolean turnLeft, boolean turnRight, double angle, boolean platformUp) {
        super(doors, 375, speed, color, name, x, y, turnLeft, turnRight);
        this.platform = new Platform(platformUp);
    }

    public double speedFactor() {
        return getEnginePower() * 0.01;
    }
    
    public double getCurrentPlatformAngle() {
        return platform.getCurrentPlatformAngle();
    }

    public int getMaxAngle() {
        return platform.getMaxAngle();
    }

    // Lowers or raises the platform depending if "angle" is negative or positive. The car has to be standing still to move the platform.
    // The range is between 70 degrees (fully raised) and 0 degrees (fully lowered).
    public void anglePlatorm(double angle) {
        boolean isNotMoving = TruckIsIsNotMoving(getCurrentSpeed());
        platform.anglePlatorm(angle, isNotMoving);
    }

    // Returns true if the car is not moving
    public boolean TruckIsIsNotMoving(double speed) {
        return (speed == 0);
    }

    @Override
    public void gas(double amount) {
        try {
            if ((amount <= 0 || amount >= 1) || platform.getCurrentPlatformAngle() > 0) {
                throw new Exception();
            } else {
                incrementSpeed(amount);
            }

        } catch (Exception e) {
            System.out.println("impossible amount");
        }
    }
}
