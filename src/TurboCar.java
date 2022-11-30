package src;

import java.awt.Color;

public class TurboCar extends Car{
    private boolean turboOn;
    private double turbo;

    public TurboCar(int doors, double power, double speed, Color caColor, String name, double x, double y, boolean left,
            boolean right,double turbo) {
        super(doors, power, speed, caColor, name, x, y, left, right);
        this.turboOn=false;
        this.turbo=turbo;
        //TODO Auto-generated constructor stub
    }
    public void setTurboOn() {
        this.turboOn = true;
    }

    public void setTurboOff() {
        turboOn = false;
    }

    public boolean getTurboOn() {
        return this.turboOn;
    }

    public double getTurboValue() {
        if (turboOn){
            return this.turbo;
        }else{
            return 1;
        }
    }
    double speedFactor() {
        return getEnginePower() * 0.01 * getTurboValue();
    }
    
}

   
