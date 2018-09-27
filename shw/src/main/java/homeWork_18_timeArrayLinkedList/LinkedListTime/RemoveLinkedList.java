package homeWork_18_timeArrayLinkedList.LinkedListTime;

import homeWork_18_timeArrayLinkedList.InputNumber;

import java.util.LinkedList;
import java.util.List;

public class RemoveLinkedList extends InputNumber {
    private List<Integer> linkedList = new LinkedList<>();

    public void onePeopleLinkedList() {
        int size = inputCountPeople();
        initializationCollection(size, linkedList);
        System.out.println("Время выполнения LinkedLis: ");
        System.out.println("Последний человек  " + deletePeople(linkedList));
    }
}
