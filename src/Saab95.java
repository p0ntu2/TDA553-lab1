package src;
import java.awt.*;

public class Saab95 extends Car {

    private boolean turboOn;
    
    public Saab95(int nrDoors, double enginePower, double speed, Color color, String modelName, double x, double y, boolean left, boolean right){
        super(nrDoors, enginePower, speed, color, modelName, x, y, left, right);
	    turboOn = false;
        stopEngine();
    }

    public void setTurboOn(){
	    turboOn = true;
    }

    public void setTurboOff(){
	    turboOn = false;
    }
    
    public double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
    }

    public void incrementSpeed(double amount){
        double speed = getCurrentSpeed() + speedFactor() * amount;
        setCurrentSpeed(speed);
    }

    public void decrementSpeed(double amount){
        double speed = getCurrentSpeed() - speedFactor() * amount;
        setCurrentSpeed(speed);
    }
}
