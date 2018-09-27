package homeWork_18_timeArrayLinkedList.ArrayListTime;

import homeWork_18_timeArrayLinkedList.InputNumber;

import java.util.ArrayList;
import java.util.List;

public class RemoveArrayList extends InputNumber {
    private List<Integer> arrayList = new ArrayList<>();

    public void onePeopleArrayList() {
        int size = inputCountPeople();
        initializationCollection(size, arrayList);
        System.out.println("Время выполнения ArrayLis: ");
        System.out.println("Последний человек  " + deletePeople(arrayList));
    }
}
