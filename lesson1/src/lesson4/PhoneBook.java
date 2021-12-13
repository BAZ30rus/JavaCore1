package lesson4;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    /*2. Написать простой класс «Телефонный Справочник», который хранит в себе список фамилий и телефонных номеров. В этот
    телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона
    по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда
    при запросе такой фамилии должны выводиться все телефоны.
    Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес), взаимодействие с
    пользователем через консоль и т.д). Консоль использовать только для вывода результатов проверки телефонного
    справочника.*/

    HashMap<Integer, String> phoneBook = new HashMap<>();

    public void add(Integer number, String name){
        phoneBook.put(number, name);
    }

    public void get(String name){
        for (Map.Entry<Integer, String> p : phoneBook.entrySet()){
            if (p.getValue() == name){
                System.out.println(p.getValue() + " : " + p.getKey());
            }
        }
    }
}
