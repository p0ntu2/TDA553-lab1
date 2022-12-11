package src.model;

import java.awt.*;
import javax.swing.*;

import src.view.CarView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import java.util.List;
import java.util.Timer;

public class CarModel {
    
    private CarView view;
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
