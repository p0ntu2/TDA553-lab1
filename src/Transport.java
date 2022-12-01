package src;

import java.awt.Color;

public class Transport extends Car {
    private CarLoader loader;


    public Transport(int doors, double power, double speed, Color caColor, String name, double x, double y,
            boolean left, boolean right, double maxLoad, double currentLoad) {
        super(doors, power, speed, caColor, name, x, y, left, right);
        this.loader=new CarLoader(maxLoad, currentLoad, x, y);


        // TODO Auto-generated constructor stub
    }
    public double getCurrentLoad(){
        return loader.getCurrentLoad();
    }

    private void loadCars(Car car) {
        loader.loadCars(car);
    }

    private void unLoadCar() {
        loader.unLoadCar();
    }
    private void unLoadAllCars(){
        loader.unLoadAllCars();
    }
    @Override
    double speedFactor() {
        // TODO Auto-generated method stub
        return 0;
    }

}
