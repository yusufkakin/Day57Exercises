package interfaceexercise.interfaceinabox;

import java.util.ArrayList;

public class Box implements Packable{

    public double maxCapacity;
    public ArrayList<Packable> box;

    public Box(int maxCapacity){
    this.maxCapacity = maxCapacity;
    this.box = new ArrayList<>();
    }

    public void add(Packable item) {
        if (!isItMax(item)) {
            box.add(item);

        }
    }

    public Packable pickIt(int index){
        return box.get(index);
    }

    public boolean isItMax(Packable item) {
        return !(this.weight() + item.weight() <= this.maxCapacity);
    }
    @Override
    public double weight() {
        double weight = 0;
            for (Packable item : box) {
                weight+= item.weight();
            }
        return weight;
    }

    @Override
    public String toString() {
        return "Box " + this.box.size() + " items, total weight " + this.weight() + " kg";
    }
}
