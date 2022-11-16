public class OuterClassA {
    public int num1 = 1;
    public static final int WHATEVER=123; //konwencja sugeruje zapis stalych WIELKIMI literami
    public final int exampleNumber=256;
    //stala wtedy gdy dodamy slowo static final
    //niezmienna wtedy go samo slowo final

    //metody oraz klasy statyczne maja dostep do STALYCH oraz metod statycznych klasy
    //metody oraz klasy statyczne NIE maja dostepu do pozostalych elementow
    public static class NestedClassA{
        public int num2 = 2;

        public void printConst(){
            System.out.println(WHATEVER);
            //System.out.println(exampleNumber); //niezmienna NIE jest dostepna dla elementow statycznych!!!
        }
    }

    public class InnerClassA{
        public int num3 = 3;
        public void printNum1(){
            System.out.println(num1);
            System.out.println(WHATEVER);   //STALE sa dostepne dla niestatycznych elementow klasy
            System.out.println(exampleNumber); //niezmienna jest dostepna z poziomu klasy wewnetrznej niestatycznej
        }
    }
}
