package src;

import java.util.ArrayList;
import java.util.Random;

public class Workshop extends CarLoader{
    private double maxLoad;
    private double currentLoad;
    private double x;
    private double y;
    private String name;
    private ArrayList<Car> loadedCars = new ArrayList<Car>();
    Random random = new Random();

    public Workshop(double maxLoad, double currentLoad,double x, double y,String name){
        super(maxLoad, currentLoad, x, y);
        this.maxLoad=maxLoad;
        this.currentLoad=0;
        this.x=x;
        this.y=y;
        this.name=name;
        this.loadedCars=null;
    }
    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }
    public String getName(){
        return this.name;
    }
   
    
}
