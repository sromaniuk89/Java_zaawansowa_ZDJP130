public class Vehicle {
    protected int speed;
    protected int maxSpeed;

    public Vehicle(int speed, int maxSpeed) {
        this.speed = speed;
        this.maxSpeed = maxSpeed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    protected void printMaxSpeed(){
        System.out.println(maxSpeed);
    }
}
