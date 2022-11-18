package src;
import java.awt.*;

public class Volvo240 extends Car {

    private final static double trimFactor = 1.25;
    
    public Volvo240(int nrDoors, double enginePower, double speed, Color color, String modelName, double x, double y, boolean left, boolean right){
        super(nrDoors, enginePower, speed, color, modelName, x, y, left, right);
        stopEngine();
    }
    
    public double speedFactor(){
        return getEnginePower() * 0.01 * trimFactor;
    }

    public void incrementSpeed(double amount){
	    double speed = Math.min(getCurrentSpeed() + speedFactor() * amount, getEnginePower());
        setCurrentSpeed(speed);
    }

    public void decrementSpeed(double amount){
        double speed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
        setCurrentSpeed(speed);
    }
}
