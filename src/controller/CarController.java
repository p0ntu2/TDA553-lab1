package src.controller;

import java.awt.*;
import javax.swing.*;

import src.model.Car;
import src.model.CarModel;
import src.model.Saab95;
import src.model.Scania;
import src.model.Volvo240;
import src.view.CarView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/*
* This class represents the Controller part in the MVC pattern.
* It's responsibilities is to listen to the View and responds in a appropriate manner by
* modifying the model state and the updating the view.
 */

public class CarController extends JPanel{
    // member fields:

    // The delay (ms) corresponds to 20 updates a sec (hz)
    private final int delay = 50;
    // The timer is started with an listener (see below) that executes the statements
    // each step between delays.
    private Timer timer = new Timer(delay, new TimerListener());

    // The frame that represents this instance View of the MVC pattern
    CarView frame;
    // A list of cars, modify if needed
    ArrayList<Car> cars = new ArrayList<>();

    private CarModel model;

    //methods:

    public static void main(String[] args) {
        // Instance of this class
        CarController cc = new CarController();

        Volvo240 volvo = new Volvo240(4, 100, 0, Color.black, "Volvo240", 0, 0, false, false); 
        Saab95 saab = new Saab95(2, 125, 0, Color.red, "Saab95", 0, 100, false, false);
        Scania scania = new Scania(2, 375, 0, Color.yellow, "Scania", 0, 200, false, false, 0, 70);

        cc.cars.add(volvo);
        cc.cars.add(saab);
        cc.cars.add(scania);

        // Start a new view and send a reference of self
        cc.frame = new CarView("CarSim 1.0", cc, cars);

        // Start the timer
        cc.timer.start();
    }

    /* Each step the TimerListener moves all the cars in the list and tells the
    * view to update its images. Change this method to your needs.
    * */
     private class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            model.gasPressed(cars);
        }

    }
}
