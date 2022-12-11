package src.model;

import src.view.CarView;

import java.util.List;

public class CarModel {
    
    private CarView view;
    private List<Car> cars;

    public CarModel(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCarList() {
        return cars;
    }
    
    public void addCar(Car car) {
        cars.add(car);
    }

    public void run() {
        while (true) {
            update();
        }
    }

    public void update() {
        

    }

    public void gasPressed(List<Car> cars) {
        for (Car car : cars) {
            car.move();
            int x = (int) Math.round(car.getX());
            int y = (int) Math.round(car.getY());
            
            if (car == cars.get(0)) {
                view.moveVolvo(x, y);
            } else if (car == cars.get(1)) {
                view.moveSaab(x, y);
            } else if (car == cars.get(2)) {
                view.moveScania(x, y);
            }
            // repaint() calls the paintComponent method of the panel
            view.repaint();
        }
    }

        // Calls the gas method for each car once
        void gas(int amount) {
            double gas = ((double) amount) / 100;
            for (Car car : cars) {
                car.tryGas(gas);
            }
        } 
}
