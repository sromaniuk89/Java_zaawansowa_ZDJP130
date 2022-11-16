public class InheritanceExample {
    public static void main(String[] args) {
        ClassA aa = new ClassA();
        ClassA ab = new ClassB();
        ClassB b = new ClassB();

        aa.printText(); //wywolana zostaje metoda z ClassA
        ab.printText(); //wywolana zostaje metoda z ClassB
        b.printText();  //wywolana zostaje metoda z ClassB
        b.printText("Additional text");     //wywolana zostaje metoda przeciazona z metody ClassB
        //ab.printText("Additional text");    //mimo ze ClassB posiada metode przeciazona, to w przypadku zreferowania
        //na klase bazowa ktora tej metody przeciazonej nie posiada -> to nie mozemy jej uzyc

        //typ obiektu decyduje ktora metoda przeslonieta zostanie uruchomiona
        //typ referencji mowi nam do jakich metod przeciazonych mamy dostep!!!

        ((ClassB)ab).printText("Additional text for ab"); //gdy zrzutujemy na wlasciwa klase (podamy typ referencji
        // na ClassB, to wowczas mamy dostep do jej pol

        ClassC classC = new ClassC();

        System.out.println(classC.getNumber());
    }
}
