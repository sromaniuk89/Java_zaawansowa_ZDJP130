//slowko extends uzyte przy nazwie parametru generycznego, definiuje jaki zakres typow moze zostac zastosowany
//extends mowi nam ze dany typ generyczny moze byc parametryzowany typami dziedziczacymy po typie podanym za extends
//w ponizszym przypadku mowimy ze klasa BoxForFruits<T extends IEat> moze zostac sparametryzowana typami w hierarchii
//dziedziczenia po typie referencyjnym IEat
public class BoxForFruits<T extends IEat & IJuiceMaker> {
//oprocz extends mozna rowniez okreslac zakres typow w klasie/metodzie generycznej za pomoca slowka super
//extends-ogranicza zakres od gory w hierarchii dziedziczenia
//super-ogranicza zakres od dolu w hierarchii dziedziczenia <- super jest rzadko uzywany

    private T fruit;

    public BoxForFruits(T fruit) {
        this.fruit = fruit;
    }

    public T getFruit() {
        return fruit;
    }

    public void eatFruitFromTheBox(){
        fruit.eat(); //mowiac ze parametr T dziedziczy po IEat uzyskujemy dostep do metod z IEat
    }

    public void makeJuiceFromTheFruit(){
        fruit.makeJuice();
    }
}
