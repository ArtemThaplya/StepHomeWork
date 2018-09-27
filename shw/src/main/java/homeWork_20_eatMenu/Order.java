package homeWork_20_eatMenu;

import java.util.Scanner;

public class Order {
    private Scanner scanner = new Scanner(System.in);
    private String meal;

    String inputOrder() {
        System.out.println("Выберите блюда для заказа(вводите названия блюд через пробел):");
        return meal = scanner.nextLine();

    }
}
