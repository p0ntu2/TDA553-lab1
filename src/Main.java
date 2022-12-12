package src;

import java.util.ArrayList;
import java.util.List;
import src.controller.Init;
import src.modell.Car;
import src.modell.CarFactory;;

public class Main {
    static List<Car> carlist = new ArrayList<Car>();
    // private static Timer timer;
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