package src;
import java.awt.*;

public class Saab95 extends Car {
    private TurboCar turboCar = new TurboCar();

    public Saab95(int doors, int power, int speed, Color color, String name, int x, int y, boolean turnLeft, boolean turnRight) {
        super(doors, power, speed, color, name, x, y, turnLeft, turnRight);
        this.turboCar = new TurboCar();
    }

    public double speedFactor() {
        return getEnginePower() * 0.01 * turboCar.getTurboValue();
    }
}
