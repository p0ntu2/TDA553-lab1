package src;

import java.awt.Color;

import javax.swing.tree.TreeCellEditor;

public class Transport extends Truck {
    private CarLoader loader;
    private Boolean rampUp;


    public Transport(int doors, double power, double speed, Color caColor, String name, double x, double y,
            boolean left, boolean right, double maxLoad, double currentLoad) {
        super(doors, power, speed, caColor, name, x, y, left, right);
        this.loader=new CarLoader(maxLoad, currentLoad, x, y);
        this.rampUp=false;


        // TODO Auto-generated constructor stub
    }
    public void setRampUpTrue() {
        this.rampUp = true;
        setCanMoveTrue();
    }
    public void setRampUpFalse() {
        if(getCurrentSpeed()==0){
            this.rampUp = false;
            setCanMoveFalse();
        }  
    }
    public double getCurrentLoad(){
        return loader.getCurrentLoad();
    }

    private void loadCars(Car car) {
        if(rampUp==false){
            loader.loadCars(car);
        }

    }

    private void unLoadCar() {
        if (rampUp=false){
            loader.unLoadCar();
        }
        
    }
    private void unLoadAllCars(){
        if (rampUp=false){
        loader.unLoadAllCars();
        }
    }
}
