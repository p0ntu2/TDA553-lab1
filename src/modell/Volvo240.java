package src.modell;
import java.awt.*;

public class Volvo240 extends Car {

    private TrimCar trimCar;

    public Volvo240(int doors, int power, int speed, Color color, String name, int x, int y, boolean turnLeft, boolean turnRight) {
        super(doors, power, speed, color, name, x, y, turnLeft, turnRight);
        this.trimCar = new TrimCar(1.25);
        
    }

    public double speedFactor() {
        return getEnginePower() * 0.01 * trimCar.getTrimFactor();
    }
}