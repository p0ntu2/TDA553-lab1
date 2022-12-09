package src.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarLoader {

    private double maxLoad;
    private double currentLoad;
    private double x;
    private double y;
    private List<Car> loadedCars;
    Random random = new Random();

    public CarLoader(double maxLoad, double currentLoad, double x, double y){
        this.x=x;
        this.y=y;
        this.currentLoad=currentLoad;
        this.maxLoad=maxLoad;
        this.loadedCars=new ArrayList<Car>();
    }
    public double getCurrentLoad(){
        return this.currentLoad;
    }
    
    public List<Car> getCurrentLoadedCars(){
        return this.loadedCars;
    }

    public void loadCars(Car car) {
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
}
