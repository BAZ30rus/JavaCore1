package lesson3;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruitList = new ArrayList<>();

    public Box(){
    }

    public ArrayList<T> getFruitList() {
        return fruitList;
    }

    public void addFruit(T fruit) {
        fruitList.add(fruit);
    }

    public float getWeight() {
        return fruitList.size() * fruitList.get(0).getWeight();
    }

    public boolean compare(Box otherBox){
        if(this.getWeight() == otherBox.getWeight()){
            System.out.println("Коробки весят одинаково");
            return true;
        } else {
            System.out.println("У коробок разный вес");
            return false;
        }
    }

    public void pourOver(Box<T> otherBox) {
        otherBox.getFruitList().addAll(fruitList);
        fruitList.clear();
    }
}
