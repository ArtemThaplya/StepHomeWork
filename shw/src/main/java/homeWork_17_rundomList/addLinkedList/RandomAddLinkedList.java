package homeWork_17_rundomList.addLinkedList;

import homeWork_17_rundomList.InputMenu;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class RandomAddLinkedList extends InputMenu {
    private List<Integer> linkedList = new LinkedList<>();

    void inputSize() {
        fillCollectionRandomNumberArrayList(inputMenuSize(), inputMenuRange(), linkedList);
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "RandomAddArrayList{" +
                "arrayList=" + linkedList +
                '}';
    }
}
