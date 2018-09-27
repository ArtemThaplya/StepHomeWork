package homeWork_14_InternetMagaz;

import homeWork_14_InternetMagaz.admin.AddTovar;
import homeWork_14_InternetMagaz.admin.Tovar;
import homeWork_14_InternetMagaz.interfacesFile.CellPhones;
import homeWork_14_InternetMagaz.interfacesFile.PhonsAndTablets;
import homeWork_14_InternetMagaz.interfacesFile.Product;

import java.util.Scanner;

public class Smartphone implements Product, PhonsAndTablets, CellPhones {
    private ChoiceFrame secFrame = new ChoiceFrame();
    private AddTovar addTovar = new AddTovar();
    private Scanner scanner = new Scanner(System.in);


    public void hellowFrame() {
        System.out.println(toString());
        int result = selectionOfGoods();
        if (result == 1.0) {
            secFrame.choiceTwoFrame();
            secFrame.printThreeFrame();
        }
        if (result == 2.0) {
            if (addTovar.list.isEmpty()) {
                System.out.println(addTovar.list.add(new Tovar("LG", 12000, 12)));
                addTovar.printOurTovar();
                System.out.println("Введите название товара и мы свяжемся с вами течении 5 минут!");
                scanner.nextLine();
            } else System.out.println("Новых товаров нет!");
            hellowFrame();
        }
        if (result == 3.0) {
            System.out.println("Извините, єтого тавара нет в наличии!");
            hellowFrame();
        }
        if (result == 4.0) {
            System.out.println("Извините, єтого тавара нет в наличии!");
            hellowFrame();
        }
        if (result == 5.0) {
            System.exit(0);
        }
    }

    @Override
    public String toString() {
        return "Выбирите пожалуйста пункт меню: \n"
                + "1 - " + PHONS_AND_TABLETS
                + "\n2 - " + TV
                + " \n3 - " + LAPTOP
                + "\n4 - " + SSD
                + "\n5 - " + "EXIT";
    }
}

