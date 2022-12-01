package src;
import java.awt.*;

public class Saab95 extends Car {



    public Saab95(int doors, int power, int speed, Color color, String name, int x, int y, boolean turnLeft, boolean turnRight,double turbo){
        super(doors, power, speed, color, name, x, y, turnLeft, turnRight);
        new TurboCar turbo= new

    }
    double speedFactor() {
        return getEnginePower() * 0.01 * getTurboValue();
    }
    

}
