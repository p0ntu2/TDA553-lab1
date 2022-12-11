package src.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

import src.view.DrawPanel;
import src.model.*;

public class TimerListener implements ActionListener {
    List<Car> carlist=new ArrayList<Car>();
    DrawPanel frame;


    // public TimerListener(List<Car> list){
    //     carlist=list;
    public void actionPerformed(ActionEvent e) {
        for (Car car : carlist) {
            car.move();
            int x = (int) Math.round(car.getX());
            int y = (int) Math.round(car.getY());
            if (car instanceof Volvo240) {
                frame.moveVolvo(x, y);
            }
            else if (car instanceof Saab95) {
               frame.moveSaab(x, y);
            }
            else if (car instanceof Scania) {
               frame.moveScania(x, y);
            }
            // repaint() calls the paintComponent method of the panel
            frame.repaint();
        }
    }

}