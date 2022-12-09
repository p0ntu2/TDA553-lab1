package src;

import java.util.List;

import javax.swing.text.SimpleAttributeSet;

import src.controller.CarController;
import src.model.Car;
import src.model.CarModel;
import src.view.CarView;

public class CarSimulator {


  public void update() {
    
  }








  public static void main(String[] args) {
    List<Car> cars;
    CarModel model = new CarModel();
    CarController controller = new CarController();
    cars = model.getCarList();
    CarView view = new CarView("CarSimulator", controller, cars);

    CarSimulator simulator = new CarSimulator();
    simulator.update();
  }
}