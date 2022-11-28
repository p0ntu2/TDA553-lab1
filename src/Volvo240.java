package src;
import java.awt.*;

public class Volvo240 extends Car {

    private final static double trimFactor = 1.25;

    public Volvo240(int doors, int power, int speed, Color color, String name, int x, int y, boolean turnLeft, boolean turnRight) {
        super(doors, power, speed, color, name, x, y, turnLeft, turnRight);

    }

    public double speedFactor() {
        return getEnginePower() * 0.01 * trimFactor;
    }


}
