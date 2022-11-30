package src;

public class RampFunction {
    private Boolean rampUp;

    public RampFunction(){
        this.rampUp=false;
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
    
    
}
