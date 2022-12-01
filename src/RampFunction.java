package src;
import java.awt.*;

public class RampFunction extends Car{
    private Boolean rampUp;
    private double maxAngle,angle;

    public RampFunction(int doors, double power, double speed, Color caColor, String name, double x, double y, boolean left,
    boolean right,double maxAngle, double angle){
        super(doors, power, speed, caColor, name, x, y, left, right);
        this.rampUp=false;
        this.maxAngle=maxAngle;
        this.angle=angle;


    }

    public void set_ramp_as_up(){
        this.rampUp=true;
    }
    
    public void set_ramp_as_down(){
        this.rampUp=false;
    }

    public boolean get_ramp_position(){
        return this.rampUp;
    }

    @Override
    double speedFactor() {
        // TODO Auto-generated method stub
        return 0;
    }
    
    
}
