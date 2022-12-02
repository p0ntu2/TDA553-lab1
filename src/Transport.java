package src;

import java.awt.Color;

public class Transport extends Truck {
    private CarLoader loader;
    private Boolean rampDown;

    public Transport(int doors, double power, double speed, Color caColor, String name, double x, double y,
            boolean left, boolean right, double maxLoad, double currentLoad) {
        super(doors, power, speed, caColor, name, x, y, left, right);
        this.loader = new CarLoader(maxLoad, currentLoad, x, y);
        this.rampDown = false;
    }

    public void setrampDownTrue() {
        if (getCurrentSpeed() == 0) {
            this.rampDown = true;
            setCanMoveFalse();
        }
    }

    public void setrampDownFalse() {
        this.rampDown = false;
        setCanMoveTrue();

    }

    public double getCurrentLoad() {
        return loader.getCurrentLoad();
    }
    public boolean getRampPosition(){
        return this.rampDown;
    }

    public void loadCars(Car car) {
        if (rampDown == true) {
            loader.loadCars(car);
        }

    }

    public void unLoadCar() {
        if (rampDown = true) {
            loader.unLoadCar();
        }

    }

    public void unLoadAllCars() {
        if (rampDown = true) {
            loader.unLoadAllCars();
        }
    }
}
