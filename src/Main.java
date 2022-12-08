package src;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        CarView view= new CarView(800,800);
       List<Car> carlist=new ArrayList<Car>();
       carlist.add(CarFactory.createSaab());
       carlist.add(CarFactory.createVolvo());
       carlist.add(CarFactory.createtransport());
       CarController cc = new CarController(carlist);
    }
}