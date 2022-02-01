package lesson1;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> box;

    public float getWeight(){
        float a = 0.0f;
        for (T t : box) {
            a+= t.getWeight();
        }
        return a;
    }

    public boolean compare(Box<?> second){
        return Math.abs(this.getWeight() - second.getWeight()) < 0.0001;
    }

    public void move(Box<? super T> second){
        if (second== this){
            return;
        }
        second.box.addAll(this.box);
        this.box.clear();
    }

    public void add(T fruit){
        box.add(fruit);
    }
}
