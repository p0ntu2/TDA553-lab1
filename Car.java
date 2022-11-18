import java.awt.*;

interface CarInterface{ 
    public void setCurrentSpeed(double amount);
    public double getCurrentSpeed();
    public Color getColor();
    public void setColor(Color clr);
    public double speedFactor(double trimFactor);
    public void startEngine();
    public void stopEngine();
    public void incrementSpeed(double amount, double trimFactor);
    public void decrementSpeed(double amount, double currentSpeed);
    public void gas(double amount);
    public void brake(double amount); 
}

public abstract class Car implements CarInterface, MovableInterface{

    public int nrDoors; // Number of doors on the car
    public double enginePower; // Engine power of the car
    public double currentSpeed; // The current speed of the car
    public Color color; // Color of the car
    public String modelName; // The car model name
    public double x; // x position
    public double y; // y position

        public void setCurrentSpeed(double amount) {
            currentSpeed = amount;
        }

        public double getCurrentSpeed(){
            return currentSpeed;
        }

        public Color getColor() {
            return color;
        }
        
        public void setColor(Color clr) {
            color = clr;
        }

        public void startEngine() {
            currentSpeed = 0.1;
        }
        
        public void stopEngine() {
            currentSpeed = 0;
        }
        
        public double speedFactor(double trimFactor){
            return enginePower * 0.01 * trimFactor;
        }
    
        public void incrementSpeed(double amount, double trimFactor){
            currentSpeed = Math.min(getCurrentSpeed() + speedFactor(trimFactor) * amount,enginePower);
        }
    
        public void decrementSpeed(double amount, double speedFactor){
            currentSpeed = Math.max(getCurrentSpeed() - speedFactor(speedFactor) * amount,0);
        }

        public double getX(){
            return x;
        }

        public void setX(double amount){
            x = amount;
        }

        public double getY(){
            return this.y;
        }

        public void setY(double amount){
            y = amount;
        }

        public void move(){
            this.y =+ this.currentSpeed;
        }
    
        public void turnLeft(){
            this.x =- this.currentSpeed;
            this.y =+ this.currentSpeed;
        }
    
        public void turnRight(){
            this.x =+ this.currentSpeed;
            this.y =+ this.currentSpeed;
        }

    // TODO fix this method according to lab pm
        public void gas(double amount){
        incrementSpeed(amount, amount );
        }

    // TODO fix this method according to lab pm
        public void brake(double amount){
        decrementSpeed(amount, amount);
        }
} 