package src;

import java.util.ArrayList;
import java.util.List;

import src.controller.CarController;
import src.controller.Init;
import src.modell.Car;
import src.modell.CarFactory;
import src.view.CarView;

public class Main {
    static List<Car> carlist = new ArrayList<Car>();
    public static void main(String[] args) {
    carlist.add(CarFactory.createSaab());
    carlist.add(CarFactory.createVolvo());
    carlist.add(CarFactory.createScania());
    Init(carlist);
    }


}