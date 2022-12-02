package src;
import java.awt.Color;
import java.util.*;
import java.util.Random;

public class CarTransporter extends Truck { 

    private double maxLoad;
    private double currentLoad;
    private CarWorkshop loader;
    private List<Car> loadedCars = new ArrayList<Car>();
    Random random = new Random()
    
    public CarTransporter(int doors, int power, int speed, Color color, String name, int x, int y, boolean turnLeft, boolean turnRight, double angle, double maxLoad, double currentLoad) {
        super(doors, 375, speed, color, name, x, y, turnLeft, turnRight, angle, false);
        this.maxLoad = maxLoad;
        this.currentLoad = currentLoad;
        this.loadedCars = null;
        this.loader=new CarLoader(maxLoad, currentLoad, x, y);
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

}
