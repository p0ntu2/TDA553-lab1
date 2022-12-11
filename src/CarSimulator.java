package src;

import javax.swing.*;
import javax.swing.Timer;


import java.lang.ModuleLayer.Controller;
import java.net.http.WebSocket.Listener;
import java.util.ArrayList;
import java.util.List;

import src.controller.CarController;
import src.model.Car;
import src.model.CarFactory;
import src.model.CarModel;
import src.view.CarView;
import src.controller.TimerListener;

public class CarSimulator {
    // private static Timer timer;
    private final int delay = 50;
    private Timer timer = new Timer(delay, new TimerListener());
    static Init init;
    static TimerListener listener;
    static CarModel model;

    public CarSimulator() {

    }

    public static void main(String[] args) {
        
        // listener=new TimerListener(carlist);
        // timer = new Timer(50,listener);

        CarSimulator cars = new CarSimulator();

        model = new CarModel(new ArrayList(3));
        model.addCar(CarFactory.createVolvoCar());
        model.addCar(CarFactory.createSaabCar());
        model.addCar(CarFactory.createScaniaCar());
        

        init = new Init(model.getCarList(),"name", 800, 800);
        CarView view = new CarView("Simulator", 800, 800);

    }

}