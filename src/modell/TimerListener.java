package src.modell;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import src.controller.Init;

public class TimerListener implements ActionListener {
    List<Car> carlist=new ArrayList<Car>();
    public TimerListener(List<Car> list){
        carlist=list;

    }


    // public TimerListener(List<Car> list){
    //     carlist=list;
    public void actionPerformed(ActionEvent e) {
        for (Car car : carlist) {
            car.move();
            int x = (int) Math.round(car.getX());
            int y = (int) Math.round(car.getY());
            if (car instanceof Volvo240) {
                Init.movevolvo(x, y);
            }
            else if (car instanceof Saab95) {
               Init.movesaab(x, y);
            }
            else if (car instanceof Scania) {
               Init.movescania(x, y);
            }
            // repaint() calls the paintComponent method of the panel
            Init.paintover();
        }
    }
    
}