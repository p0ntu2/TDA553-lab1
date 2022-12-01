package src;

import java.util.ArrayList;
import java.util.Random;

public class CarLoader {

    private double maxLoad;
    private double currentLoad;
    private double x;
    private double y;
    private ArrayList<Car> loadedCars = new ArrayList<Car>();
    Random random = new Random();

    public CarLoader(double maxLoad, double currentLoad, double x, double y){
        this.x=x;
        this.y=y;
        this.currentLoad=currentLoad;
        this.maxLoad=maxLoad;
        this.loadedCars=null;
    }
    public double getCurrentLoad(){
        return this.currentLoad;
    }

    public void loadCars(Car car) {
        double currentLoad = 0;
        if (currentLoad <= maxLoad) {
            if (car.getX() > this.x - 10 && car.getX() < this.x + 10 && car.getY() > this.y - 10
                    && car.getY() < this.y + 10) {
                this.loadedCars.add(car);
            }
        }
    }

    public void unLoadCar() {
        double x=0;
        double y=0;
        if (this.loadedCars.size() != 0) {
            Car currentCar = this.loadedCars.get(this.loadedCars.size() - 1);
            this.loadedCars.remove(this.loadedCars.size() - 1);
            while(x<=0){
                x=random.nextDouble(this.x + 10)+(this.x - 10);
            }
            while(y<=0){
                y=random.nextDouble(this.y + 10)+(this.y - 10);
            }
            currentCar.setX(x);
            currentCar.setY(y);
        }
    }
    public void unLoadAllCars(){
        this.loadedCars.forEach((Car)->unLoadCar());
    }
}
