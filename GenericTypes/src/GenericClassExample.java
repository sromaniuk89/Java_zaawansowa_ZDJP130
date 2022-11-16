public class GenericClassExample {
    public static void main(String[] args) {
        //parametryzujemy klase generyczna BoxForFruits typem Apple i tworzymy jej instancje
        BoxForFruits<Apple> appleBox = new BoxForFruits<>(new Apple());
        //parametryzujemy klase generyczna BoxForFruits typem Strawberry i tworzymy jej instancje
        BoxForFruits<Strawberry> strawberryBox = new BoxForFruits<Strawberry>(new Strawberry());

        Apple apple = appleBox.getFruit();
        Strawberry strawberry = strawberryBox.getFruit();

        appleBox.eatFruitFromTheBox();
        appleBox.makeJuiceFromTheFruit();
        strawberryBox.eatFruitFromTheBox();
        strawberryBox.makeJuiceFromTheFruit();

        //to nie zadziala, bo Cherry nie znajduje sie w akceptowalnym zakresie typow klasy generycznej Box...
        //BoxForFruits<Cherry> cherryBoxForFruits= new BoxForFruits<Cherry>(new Cherry());

        IEat result = randomSelection(apple,strawberry);
        //IEat result2 = randomSelection<IEat>(apple,strawberry); //nie musimy parametryzowac

        result.eat();

        doSomething(appleBox);

        doSomethingWithApple(appleBox);
        //doSomethingWithApple(strawberryBox); Strawberry nie dziedziczy po Apple dlatego nie zostanie zaakceptowane
    }

    public static <T> T randomSelection(T x, T y){
        //operator ? jest operatorem trojargumentowym i dziala jak if
        //zastosowanie: (warunek) ? (wartosc zwracana gdy true) : (wartosc zwracana gdy false)
        return Math.random()>0.5?x:y;
    }

    //w ponizszym kontekscie znak ? dziala jako wildcard, oznacza ze parametr box jest instancja klasy generycznej
    //BoxForFruits<> parametryzowanej dowolnym typem
    public static void doSomething(BoxForFruits<?> box){
        box.eatFruitFromTheBox();
    }

    //? extends Apple oznacza ze ta metoda przyjmie tylko pudelka z owocami dziedziczacymi po Apple (razem z Apple)
    public static void doSomethingWithApple(BoxForFruits<? extends Apple> box){
        //metoda throwApple jest dostepna z poziomu Apple a nie BoxForFruits<>
        //dlatego najpierw pobieram owoc (ktory wiem ze bedzie jablkiem bo tak zastrzeglem w definicji metody generycznej
        box.getFruit().throwApple();
    }
}
