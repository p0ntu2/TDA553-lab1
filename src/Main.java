package src;

import java.util.ArrayList;
import java.util.List;

import src.controller.CarController;
import src.view.CarView;

public class Main {
    public static void main(String[] args) {

        CarController cc = new CarController();
        CarView view = new CarView("name",800,800);
    }
}