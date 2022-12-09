package src;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import java.util.List;
import java.util.Timer;

public class CarModel {
    
    private List<Car> cars;

    public CarModel() {
        this.cars = cars;
        addCar(CarFactory.createVolvoCar());
        addCar(CarFactory.createSaabCar());
        addCar(CarFactory.createScaniaCar());
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
        controller.listenForInput();

    }
}
