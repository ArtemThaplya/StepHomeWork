package homeWork_18_timeArrayLinkedList;

import java.util.HashMap;
import java.util.Map;

public class DidHomeWork {
    private static Map<String, Person> map = new HashMap<>();

    static void printPerson() {
        map.put("Задание выполнил", new Person("Artem", "Tsaplya"));

        for (Map.Entry<String, Person> personEntry : map.entrySet()) {
            System.out.println(personEntry.getKey() + " : " + personEntry.getValue());
        }

        map.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
