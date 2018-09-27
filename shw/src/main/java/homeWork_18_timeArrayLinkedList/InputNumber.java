package homeWork_18_timeArrayLinkedList;

import java.util.List;
import java.util.Scanner;

public class InputNumber {
    private Scanner scanner = new Scanner(System.in);

    protected int inputCountPeople() {
        System.out.println("Введите количество людей: ");
        return Integer.parseInt(scanner.nextLine());
    }

    protected void initializationCollection(int size, List<Integer> list) {
        int number = 1;
        for (int i = 0; i < size; i++) {
            list.add(i, number++);
        }
    }

    protected List<Integer> deletePeople(List<Integer> list) {
        Long start = System.nanoTime();
        while (list.size() > 1) {
            for (int i = 0; i < list.size(); i++) {
                if (i % 2 == 0) {
                    int a = list.get(i);
                    list.remove(i);
                }
            }
        }
        Long finish = System.nanoTime();
        System.out.println(String.format("%,12d", finish - start) + " ns");
        return list;
    }
}
