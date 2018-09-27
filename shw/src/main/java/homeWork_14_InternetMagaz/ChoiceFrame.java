package homeWork_14_InternetMagaz;

import homeWork_14_InternetMagaz.interfacesFile.CellPhones;
import homeWork_14_InternetMagaz.interfacesFile.PhonsAndTablets;
import homeWork_14_InternetMagaz.interfacesFile.Product;

public class ChoiceFrame implements PhonsAndTablets, Product, CellPhones {
    private int result;

    public void secondFrame() {
        System.out.println(toString());
    }

    public void choiceTwoFrame() {
        result = selectionOfGoods();
        if (result != 1) {
            System.out.println("Извините, єтого тавара нет в наличии!");
            secondFrame();
//            choiceTwoFrame();
        }
    }

    public void printThreeFrame() {
        System.out.println("У нас есть два телефона, марки " + SAMSUNG + ", с диагональю "
                + SCREEN_SIZE + ", " + colourWhite + "цвет. И три телефона" + LENOVO
                + ", диагональ " + SCREEN_SIZE_4 + ", цвет " + colourRed + ".");
        coiseThreeFrame();
    }

    private void coiseThreeFrame() {
        String key = selectionPhone();
        switch (key) {
            case "Lenovo":
                System.out.println("Спасибо за выбор, в течени 5 минут с вами свяжется оператор, для оформления заказа.");
                break;
            case "Samsung":
                System.out.println("Спасибо за выбор, в течени 5 минут с вами свяжется оператор, для оформления заказа.");
                break;
            case "":
                System.out.println("Введите правильно производителя телефона.");
//                coiseThreeFrame();
                break;
        }
    }

    @Override
    public String toString() {
        return "Выбирите пожалуйста вид товара: "
                + "\n1 -" + PHONE + "\n2 -" + TABLETS + "\n3 -" + CHARGER;
    }
}
