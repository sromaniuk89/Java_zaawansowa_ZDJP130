import java.util.function.BiConsumer;

public class CW12 {
    public static void main(String[] args) {

        BiConsumer<Integer, Integer> drawRectangle = (w,h) -> {
            //petla zewnetrzna iteruje po wierszach
            for (int i=0; i<h; i++){
                //petla iterujaca po kolumnach
                for(int j=0;j<w;j++){
                    //teraz musimy sprawdzic czy drukowac znak czy drukowac spacje
                    //drukujemy gdy jestesmy w pierwszej badz ostatniej wierszu/kolumnie
                    if(i==0 || i==h-1 || j==0 || j==w-1){
                        System.out.print('*');
                    } else {
                        System.out.print(' ');
                    }
                }
                System.out.println();
            }
        };

        drawRectangle.accept(39,9);

    }
}
