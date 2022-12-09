package src;

import java.util.List;

public class CarSimulator {



  public static void main(String[] args) {
    List<Car> cars;
    CarModel model = new CarModel();
    CarController controller = new CarController();
    cars = model.getCarList();
    CarView view = new CarView("CarSimulator", controller, cars);
    model.update();
  
  }

}