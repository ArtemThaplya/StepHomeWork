package homeWork_1.rozetkaInterface.interfacesFile;

import java.util.Scanner;

public interface Product {
    String PHONS_AND_TABLETS = "Phons and tablets";
    String TV = "Smart TV";
    String LAPTOP = "Laptop";
    String SSD = "Ssd";
    Scanner scanner = new Scanner(System.in);

    default int selectionOfGoods() {
        System.out.println("Введите пожайлуйста номер товара: ");
        return scanner.nextInt();
    }

    default String selectionPhone() {
        System.out.println("Выберите пожалуйста теелефон(введите модель телефона).");
        return scanner.nextLine();
    }
}
