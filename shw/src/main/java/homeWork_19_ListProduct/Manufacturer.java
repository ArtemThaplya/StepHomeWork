package homeWork_19_ListProduct;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.TreeMap;

public class Manufacturer {
    private HashMap<String, Product> map = new HashMap<>();
    private TreeMap<String, Product> mapSort;
    private Scanner scanner = new Scanner(System.in);
    private int number;

    void addProduct() {
        map.put("Samsung", new Product("SmartTV", "Phone", "Clock", "Fridge"));
        map.put("Apple", new Product("Phone", "Clock"));
        map.put("Lenovo", new Product("Phone"));
    }

    void menuPrint() {
        System.out.println(toString());
        try {
            number = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException | InputMismatchException e) {
            System.out.println("Введите коректное значение!" + e);
            menuPrint();
        }
        switchManufacurer();
        sortProduct(map);
        menuPrint();
    }

    private void sortProduct(HashMap<String, Product> map) {
        mapSort = new TreeMap<>(map);
        System.out.println("Отсортированый список: \n"
                + mapSort
                + "\n--------------------------------");
    }

    private void switchManufacurer() {
        switch (number) {
            case 1:
                System.out.println(map.get("Samsung"));
                break;
            case 2:
                System.out.println(map.get("Apple"));
                break;
            case 3:
                System.out.println(map.get("Lenovo"));
                break;
            case 4:
                System.exit(0);
        }
    }

    @Override
    public String toString() {
        return "Веберите производителя: \n"
                + "1. Samsung \n"
                + "2. Apple \n"
                + "3. Lenovo \n"
                + "4. EXIT ";
    }
}
