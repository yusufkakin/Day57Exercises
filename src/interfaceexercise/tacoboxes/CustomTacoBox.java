package interfaceexercise.tacoboxes;

public class CustomTacoBox implements TacoBox {
    private final int tacos;

    CustomTacoBox(int tacos){
        this.tacos = tacos;
    }

    @Override
    public int tacosRemaining() {
        return this.tacos;
    }

    @Override
    public void eat() {

    }
}
