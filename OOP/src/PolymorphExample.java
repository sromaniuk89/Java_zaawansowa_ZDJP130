public class PolymorphExample {
    public static void main(String[] args) {
        Vehicle veh1 = new Car(1,200,3);
        Vehicle veh2 = new Bike(1,25,18);

        veh1.printMaxSpeed(); //polimorfizm polega na tym ze rozne klasy pochodne posiadajace wspolna klase bazowa
        //mozemy traktowac jak wlasnie ta klase bazowa (wspolne pola i metody)
        veh2.printMaxSpeed();

        ClassA classA = new ClassA(); //kazda klasa ma zawsze konstruktor
        //jezeli nie wstawimy konstruktora do klasy, to zostanie automatycznie umieszczony konstruktor domyslny!!!
        System.out.println(classA.a);
    }
}
