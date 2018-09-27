package homeWork_1.rozetkaInterface;

import homeWork_1.rozetkaInterface.interfacesFile.CellPhones;
import homeWork_1.rozetkaInterface.interfacesFile.PhonsAndTablets;
import homeWork_1.rozetkaInterface.interfacesFile.Product;

public class ChoiceFrame implements PhonsAndTablets, Product, CellPhones {

    public void secondFrame() {

        System.out.println(toString());
    }

    public void choiceTwoFrame() {
        if (selectionOfGoods() != 1) {
            System.out.println("Извините, єтого тавара нет в наличии!");
            secondFrame();
            choiceTwoFrame();
        }
    }

    public void printThreeFrame() {
        System.out.println("У нас есть два телефона, марки " + SAMSUNG + ", с диагональю "
                + SCREEN_SIZE + ", " + colourWhite + "цвет. И три телефона" + LENOVO
                + ", диагональ " + SCREEN_SIZE_4 + ", цвет " + colourRed + ".");
        coiseThreeFrame();
    }

    private void coiseThreeFrame() {
        switch (selectionPhone()) {
            case "Lenovo":
                System.out.println("Спасибо за выбор, в течени 5 минут с вами свяжется оператор, для оформления заказа.");
                break;
            case "Samsung":
                System.out.println("Спасибо за выбор, в течени 5 минут с вами свяжется оператор, для оформления заказа.");
                break;
            default:
                System.out.println("Введите правильно производителя телефона.");
                coiseThreeFrame();
                break;
        }
    }

    @Override
    public String toString() {
        return "Выбирите пожалуйста вид товара: "
                + "\n1 -" + PHONE + "\n2 -" + TABLETS + "\n3 -" + CHARGER;
    }
}
