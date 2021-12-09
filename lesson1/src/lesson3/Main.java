package lesson3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GenType<String> arr = new GenType<>("a", "b", "c", "d", "e");
        arr.printArray();
        arr.shuffleArray(1, 3);
        arr.printArray();

        Box<Apple> box1 = new Box<>();
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        System.out.println("Вес первой коробки: " + box1.getWeight());

        Box<Apple> box2 = new Box<>();
        box2.addFruit(new Apple());
        box2.addFruit(new Apple());
        System.out.println("Вес второй коробки: " + box2.getWeight());

        Box<Orange> box3 = new Box<>();
        box3.addFruit(new Orange());
        box3.addFruit(new Orange());
        System.out.println("Вес третьей коробки: " + box3.getWeight());

        box1.compare(box2);
        box1.compare(box3);

        System.out.println("Первая коробка:" + box1.getFruitList());
        System.out.println("Вторая коробка:" + box2.getFruitList());
        box1.pourOver(box2);
        System.out.println("Первая коробка:" + box1.getFruitList());
        System.out.println("Вторая коробка:" + box2.getFruitList());

    }

}
