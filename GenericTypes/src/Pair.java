public class Pair<T1,T2> {
    private T1 first;
    private T2 second;

    public Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    //nazwa pol i metod moze byc taka sama (ale sie nie zaleca)
    public T1 first(){
        return first;
    }

    public T2 second(){
        return second;
    }
}
