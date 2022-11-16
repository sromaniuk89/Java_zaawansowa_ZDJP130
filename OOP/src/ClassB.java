public class ClassB extends ClassA {

    //gdy klasa dziedziczaca implementuje metode o takiej samej nazwie jak w klasie bazowej, ale
    //innej sygnaturze!!! metody (czyli innych parametrach) to wowczas mowi sie ze przeciazamy metode!
    public void printText(String text){
        System.out.println("Text B: " + text);
    }

    //gdy jest taka sama sygnatura metody w klasie dziedziczacej to wowczas mowi sie o
    //przeslonieciu metody
    @Override
    public void printText(){
        System.out.println("TextB");
    }
}
