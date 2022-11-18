import java.awt.*;

public class Saab95 extends Car{ 
    private boolean turboOn = false;

    public Saab95(){
    //public Saab95(int nrDoors, double enginePower, double currentSpeed, String modelName){
        //super(nrDoors, enginePower, currentSpeed, color, modelName);
        nrDoors = 2;
        enginePower = 125;
        color = Color.red;
        modelName = "Saab95";
        currentSpeed = getCurrentSpeed();
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
        return enginePower * 0.01 * turbo;
    }
 
} 
