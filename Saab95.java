import java.awt.*;

public class Saab95 extends Car{

    public boolean turboOn;
    // public int nrDoors; // Number of doors on the car
    // public double enginePower; // Engine power of the car
    // public double currentSpeed; // The current speed of the car
    // public Color color; // Color of the car
    // public String modelName; // The car model name
    
    public Saab95(){
        super(2, 125, Color.red, "Saab95");
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

    @Override
    public void incrementSpeed(double amount){
        double speed = getCurrentSpeed() + speedFactor() * amount;
        setCurrentSpeed(speed);
    }

    public void decrementSpeed(double amount){
        double speed = getCurrentSpeed() - speedFactor() * amount;
        setCurrentSpeed(speed);
    }
    
}
