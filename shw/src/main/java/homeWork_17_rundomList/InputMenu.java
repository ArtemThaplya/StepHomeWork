package homeWork_17_rundomList;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class InputMenu {
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);
    private int size;
    private int range;

    protected int inputMenuSize() {
        System.out.println("Введите размер коллекции: ");
        try {
            size = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException | InputMismatchException e) {
            System.out.println("Ошибка ввода!  " + e);
            inputMenuSize();
        }
        return size;
    }

    protected int inputMenuRange() {
        System.out.println("Диапазон случайных чисел: ");
        try {
            range = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Ошибка ввода!  " + e);
            inputMenuRange();
        }
        return range;
    }

    protected void fillCollectionRandomNumberArrayList(int size, int range, List<Integer> collectionAdd) {
        for (int i = 0; i < size; i++) {
            collectionAdd.add(random.nextInt(range));
        }
    }
}
