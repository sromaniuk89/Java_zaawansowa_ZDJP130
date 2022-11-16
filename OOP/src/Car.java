public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(int speed, int maxSpeed, int numberOfDoors) {
        super(speed, maxSpeed);
        this.numberOfDoors = numberOfDoors;
    }

    protected void printMaxSpeed(){
        System.out.println(maxSpeed*2);
    }
}
