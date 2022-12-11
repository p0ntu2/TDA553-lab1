package src;

import javax.swing.*;


import java.lang.ModuleLayer.Controller;
import java.net.http.WebSocket.Listener;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

import src.controller.CarController;
import src.model.Car;
import src.model.CarFactory;
import src.view.CarView;
import src.controller.TimerListener;

public class CarSimulator {
    static List<Car> carlist = new ArrayList<Car>();
    // private static Timer timer;
    private final int delay = 50;
    private Timer timer = new Timer(delay, new TimerListener());
    static Init init;
    static TimerListener listener;

    public static void main(String[] args) {
        carlist.add(CarFactory.createSaabCar());
        carlist.add(CarFactory.createVolvoCar());
        carlist.add(CarFactory.createScaniaCar());
        // listener=new TimerListener(carlist);
        // timer = new Timer(50,listener);

        init = new Init(carlist, "name", 0, 0);

    }

}