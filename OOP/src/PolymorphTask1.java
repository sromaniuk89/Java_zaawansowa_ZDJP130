import java.util.Random;

public class PolymorphTask1 {
    public static void main(String[] args) {
        Shape shape1 = new Square(2.0);
        Shape shape2 = new Circle(2.0);

        shape1.area();
        shape2.area();

        System.out.println(shape1.area);
        System.out.println(shape2.area);

        Shape[] shapes = new Shape[10];
        Random rnd = new Random();

        for (int i = 0; i < shapes.length; i++) {
            if (rnd.nextBoolean()) {
                shapes[i] = new Circle(rnd.nextDouble());
            } else {
                shapes[i] = new Square(rnd.nextDouble());
            }

            shapes[i].area(); //tutaj nas nie interesuje co znajduje pod danym indeksem w tablicy typu Shape
            //obchodzi nas jedynie jakie metody mamy dostepne
        }

        for (Shape s : shapes) {
            System.out.println(s + " ");
            System.out.println(s.area);
        }
    }
}
