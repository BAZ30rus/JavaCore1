package lesson4;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

    /*1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных
    слов, из которых состоит массив (дубликаты не считаем). Посчитать, сколько раз встречается каждое слово.*/
    String[] capitals = {"Moscow", "Berlin", "London", "Paris", "Madrid", "Rome", "Belgrad", "Moscow", "Belgrad", "Moscow"};
    HashMap<String, Integer> uniqueCapitals = new HashMap<>();

        for (int i = 0; i < capitals.length; i++) {
            if (uniqueCapitals.containsKey(capitals[i])) {
                uniqueCapitals.put(capitals[i], uniqueCapitals.get(capitals[i]) + 1);
            } else {
                uniqueCapitals.put(capitals[i], 1);
            }
        }
        System.out.println(uniqueCapitals);
        System.out.println();

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(777777, "Ivanov");
        phoneBook.add(888888, "Sidorov");
        phoneBook.add(999999, "Kozlov");
        phoneBook.add(111111, "Timin");
        phoneBook.add(222222, "Ivanov");

        phoneBook.get("Ivanov");
        phoneBook.get("Sidorov");
    }
}
