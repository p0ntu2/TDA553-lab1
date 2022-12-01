package src;

import java.awt.Color;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;;

public class Transport extends Car {
    private double maxLoad;
    private double currentLoad;
    private CarLoader loader;
    private ArrayList<Car> loadedCars = new ArrayList<Car>();
    Random random = new Random();

    public Transport(int doors, double power, double speed, Color caColor, String name, double x, double y,
            boolean left, boolean right, double maxLoad, double currentLoad) {
        super(doors, power, speed, caColor, name, x, y, left, right);
        this.maxLoad = maxLoad;
        this.currentLoad = currentLoad;
        this.loadedCars = null;
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
