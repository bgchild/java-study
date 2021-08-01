package designpattern.adapter;

public class Clinet {
    public static void main(String[] args) {
        final Turkey turkey = new WildTurkey();
        final Duck duck = new DuckAdapter(turkey);
        duck.voice();
    }
}
