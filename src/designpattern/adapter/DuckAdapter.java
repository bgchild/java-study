package designpattern.adapter;

public class DuckAdapter implements Duck {
    Turkey turkey;

    public DuckAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void voice() {
        turkey.voice();
    }
}
