import java.awt.*;

public class Volvo240 extends Car{

    public final static double trimFactor = 1.25;
    // public int nrDoors; // Number of doors on the car
    // public double enginePower; // Engine power of the car
    public double currentSpeed; // The current speed of the car
    // public Color color; // Color of the car
    // public String modelName; // The car model name
    
    public Volvo240(){
        super(4, 100, Color.black, "Volvo240");
        stopEngine();
    }
    
    @Override
    public double speedFactor(){
        return enginePower * 0.01 * trimFactor;
    }

    @Override
    public void incrementSpeed(double amount){
	    currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount,enginePower);
    }

    @Override
    public void decrementSpeed(double amount){
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
    }
}
