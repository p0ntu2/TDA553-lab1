package src;
import java.awt.*;

public class Scania extends Truck {
    private double currentAngle;
    private double maxAngle;

    public Scania(int doors, int power, int speed, Color color, String name, int x, int y, boolean turnLeft, boolean turnRight, double angle,double maxAngle) {
        super(doors, 375, speed, color, name, x, y, turnLeft, turnRight);
        this.currentAngle=angle;
        this.maxAngle=maxAngle;
    }

    public double getCurrentPlatformAngle() {
        return this.currentAngle;
    }

    public double getMaxAngle() {
        return this.maxAngle;
    }

    public void setAngle(double newAngle){
        if(getCurrentSpeed()==0 & newAngleIsInsideRange(newAngle)){
            calculateNewAngle(newAngle);
            checkIfitCanMove();
        }
    }
    private void checkIfitCanMove() {
        if(this.currentAngle>0){
            setCanMoveFalse();
        }
        else{
            setCanMoveTrue();
        }
    }

    private double calculateNewAngle(double angle) {
        if (angle > 0) {
            return (this.currentAngle + angle);

        } else if (angle < 0) {
            return (this.currentAngle + angle);

        } else { 
            return this.currentAngle;
        }
    }
    private boolean newAngleIsInsideRange(double newAngle) {
        return (newAngle+this.currentAngle <= maxAngle & newAngle+this.currentAngle>=0);
    }
}
