package src.controller;

import java.awt.*;

import javax.swing.*;

import src.modell.Car;
import src.modell.CarFactory;
import src.modell.Saab95;
import src.modell.Scania;
import src.modell.Volvo240;
import src.view.CarView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        carlist.add(CarFactory.createSaab());
        carlist.add(CarFactory.createVolvo());
        carlist.add(CarFactory.createScania());


    }

    // methods:

    public static void main(String[] args) {
    // Instance of this class
        CarController cc;
    cc.carsList.add(new Volvo240(4, 100, 0, Color.black, "Volvo240", 0, 0, false,
    false));
    cc.cars.add(new Saab95(2, 125, 0, Color.red, "Saab95", 0, 100, false,
    false));
    cc.cars.add(new Scania(2, 375, 0, Color.green, "Scania", 0, 200, false,
    false, 0, 70));

    // Start a new view and send a reference of self
    cc.frame = new CarView("CarSim 1.0", cc);

    // Start the timer
    cc.timer.start();
    }

    /*
     * Each step the TimerListener moves all the cars in the list and tells the
     * view to update its images. Change this method to your needs.
     */

    private class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (Car car : carlist) {
                car.move();
                int x = (int) Math.round(car.getX());
                int y = (int) Math.round(car.getY());
                if (car instanceof Volvo240) {
                    view.movevolvo(x, y);
                }
                else if (car instanceof Saab95) {
                    view.movesaab(x, y);
                }
                else if (car instanceof Scania) {
                    view.movescania(x, y);
                }
                // repaint() calls the paintComponent method of the panel
                //frame.drawPanel.repaint();
            }
        }
    }

    // Calls the gas method for each car once
    public void gas(int amount) {
        double gas = ((double) amount) / 100;
        for (Car car : carlist) {
            car.tryGas(gas);
        }
    }
}