package homeWork_18_timeArrayLinkedList;

import homeWork_18_timeArrayLinkedList.ArrayListTime.RemoveArrayList;
import homeWork_18_timeArrayLinkedList.LinkedListTime.RemoveLinkedList;

public class Main {
    public static void main(String[] args) {
        RemoveArrayList removeArrayList = new RemoveArrayList();
        removeArrayList.onePeopleArrayList();

        RemoveLinkedList removeLinkedList = new RemoveLinkedList();
        removeLinkedList.onePeopleLinkedList();

        DidHomeWork.printPerson();
    }
}
