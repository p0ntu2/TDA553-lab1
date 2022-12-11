package src.controller;

import java.awt.*;

import javax.swing.*;

import src.model.Car;
import src.model.CarFactory;
import src.model.Saab95;
import src.model.Scania;
import src.model.Volvo240;
import src.view.CarView;


import java.util.ArrayList;
import java.util.List;

/*
* This class represents the Controller part in the MVC pattern.
* It's responsibilities is to listen to the View and responds in a appropriate manner by
* modifying the model state and the updating the view.
 */

public class CarController {
    List<Car> carlist = new ArrayList<Car>();
    CarView view;
    CarFactory factory;

    // member fields:

    // The delay (ms) corresponds to 20 updates a sec (hz)
    private final int delay = 50;
    // The timer is started with an listener (see below) that executes the
    // statements
    // each step between delays.
    public Timer timer = new Timer(delay, new TimerListener());

    // The frame that represents this instance View of the MVC pattern
    // A list of cars, modify if needed
    public CarController() {
        view = new CarView("name",800,800);
        carlist.add(CarFactory.createVolvoCar());
        carlist.add(CarFactory.createSaabCar());
        carlist.add(CarFactory.createScaniaCar());


    }

    // methods:


    /*
     * Each step the TimerListener moves all the cars in the list and tells the
     * view to update its images. Change this method to your needs.
     */

  

    // Calls the gas method for each car once
    public void gas(int amount) {
        double gas = ((double) amount) / 100;
        for (Car car : carlist) {
            car.tryGas(gas);
        }
    }
}