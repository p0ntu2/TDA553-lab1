package src;

import javax.swing.*;


import java.lang.ModuleLayer.Controller;
import java.net.http.WebSocket.Listener;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

import src.controller.Init;
import src.modell.Car;
import src.modell.CarFactory;
import src.modell.TimerListener;;

public class Main {
    static List<Car> carlist = new ArrayList<Car>();
    // private static Timer timer;
    private final int delay = 50;
    //private Timer timer = new Timer(delay, new TimerListener());
    static Init init;


    public static void main(String[] args) {
        carlist.add(CarFactory.createSaab());
        carlist.add(CarFactory.createVolvo());
        carlist.add(CarFactory.createScania());
        // listener=new TimerListener(carlist);
        // timer = new Timer(50,listener);

        init = new Init(carlist, "name", 800, 800);



    }

}