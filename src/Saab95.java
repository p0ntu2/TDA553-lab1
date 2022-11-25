package src;
import java.awt.*;

public class Saab95 extends Car {
    private boolean turboOn;

    public Saab95(int doors, int power, int speed, Color color, String name, int x, int y, boolean turnLeft, boolean turnRight) {
        super(doors, power, speed, color, name, x, y, turnLeft, turnRight);
    }

    public void setTurboOn() {
        turboOn = true;
    }

    public void setTurboOff() {
        turboOn = false;
    }

    public double speedFactor() {
        double turbo = 1;
        if (turboOn)
            turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
    }
}