public class Square extends Shape{
    double length;

    public Square(Double length) {
        this.length = length;
    }

    @Override
    public void area() {
        area=length*length;
    }
}
