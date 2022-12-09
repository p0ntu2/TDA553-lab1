package src.modell;
import java.awt.*;

public abstract class Car implements Movable {
    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private String modelName; // The car model name
    private double x;
    private double y;
    private boolean turnLeft, turnRight;

    public Car(int doors, double power, double speed, Color caColor, String name, double x, double y, boolean left,
            boolean right) {
        this.nrDoors = doors;
        this.enginePower = power;
        this.currentSpeed = speed;
        this.color = caColor;
        this.modelName = name;
        this.x = x;
        this.y = y;
        this.turnLeft = left;
        this.turnRight = right;
    }

    public int getNrDoors() {
        return this.nrDoors;
    }

    public double getEnginePower() {
        return this.enginePower;
    }

    public double getCurrentSpeed() {
        return this.currentSpeed;
    }

    public String getName(){
        return this.modelName;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color clr) {
        this.color = clr;
    }

    public void startEngine() {
        this.currentSpeed = 0.1;
    }

    public void stopEngine() {
        this.currentSpeed = 0;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setX(double ammount) {
        this.x += ammount;
    }

    public void setY(double ammount) {
        this.y += ammount;
    }

    public void turnLeft() {
        this.turnRight = false;
        this.turnLeft = true;
    }

    public boolean getTurnLeft() {
        return this.turnLeft;
    }

    public void turnRight() {
        this.turnLeft = false;
        this.turnRight = true;
    }

    public boolean getTurnRight() {
        return this.turnRight;
    }
 
    public void move() {
        if (turnLeft == true) {
            x += currentSpeed;
            y += -currentSpeed;

        } else if (turnRight == true) {
            x += currentSpeed;
            y += currentSpeed;
        } else {
            x += currentSpeed;
        }
    }

    public void tryGas(double ammount){
        gas(ammount);
    }

    public void gas(double amount) {
        try {
            if ((amount <= 0 || amount >= 1)) {
                throw new Exception();
            } else {
                incrementSpeed(amount);
            }

        } catch (Exception e) {
            System.out.println("impossible amount");
        }
    }

    public void brake(double amount) {
        try {
            if (amount <= 0 || amount >= 1) {
                throw new Exception();
            } else {
                decrementSpeed(amount);

            }
        } catch (Exception e) {
            System.out.println("impossible amount");

        }
    }

    void incrementSpeed(double amount) {
        try {
            if (currentSpeed >= enginePower) {
                throw new Exception();
            } else {
                currentSpeed = currentSpeed + speedFactor() * amount;
            }

        } catch (Exception e) {
            System.out.println("the car is already at max speed");
            currentSpeed = enginePower;
        }
    }

    private void decrementSpeed(double amount) {
        try {
            if (currentSpeed <= 0) {
                throw new Exception();
            } else {
                currentSpeed = currentSpeed - speedFactor() * amount;
            }

        } catch (Exception e) {
            System.out.println("the car is already still");
            currentSpeed = 0;
        }
    }

    abstract double speedFactor();
}