public class EnumExample {
    public enum Colour{
        RED(255,0,0),   //możliwe wartości enuma piszemy z wielkich liter
        GREEN(0,255,0),
        BLUE(0,0,255);

        public final int r, g, b;

        Colour(int r, int g, int b) {
            this.r = r;
            this.g = g;
            this.b = b;
        }

        public String getInfo(){ //typ wyliczeniowy rowniez moze posiadać metody
            return "r:" + r + " ,g:" + g + " ,b:" + b;
        }
    }

    public static void main(String[] args) {
        Colour colour1 = Colour.RED; //instancja typu wyliczeniowego Colour w kolorze RED
        Colour colour2 = Colour.GREEN;
        Colour colour3 = Colour.BLUE;

        // colour1.r=123; //pole r nie moze zostac juz zmienione, bo jest "final"

        System.out.println(colour1.getInfo());

        for(Colour colour:Colour.values()){
            System.out.println(colour.r);
        }

    }
}
