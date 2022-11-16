public class Bike extends Vehicle {
    private int numberOfGears;

    public Bike(int speed, int maxSpeed, int numberOfGears) {
        super(speed, maxSpeed);
        this.numberOfGears = numberOfGears;
    }
}
