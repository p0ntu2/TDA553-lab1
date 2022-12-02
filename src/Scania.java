package src;
import java.awt.*;

public class Scania extends Truck {

    public Scania(int doors, int power, int speed, Color color, String name, int x, int y, boolean turnLeft, boolean turnRight, double angle) {
        super(doors, 375, speed, color, name, x, y, turnLeft, turnRight, angle, 70);
    }
}
