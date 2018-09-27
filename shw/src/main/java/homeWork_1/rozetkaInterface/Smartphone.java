package homeWork_1.rozetkaInterface;

import homeWork_1.rozetkaInterface.interfacesFile.CellPhones;
import homeWork_1.rozetkaInterface.interfacesFile.PhonsAndTablets;
import homeWork_1.rozetkaInterface.interfacesFile.Product;

public class Smartphone implements Product, PhonsAndTablets, CellPhones {
    private ChoiceFrame secFrame = new ChoiceFrame();

    public void hellowFrame() {
        System.out.println(toString());
        if (selectionOfGoods() != 1.0) {
            System.out.println("Извините, єтого тавара нет в наличии!");
            hellowFrame();
        } else secFrame.secondFrame();

        secFrame.choiceTwoFrame();
        secFrame.printThreeFrame();
    }


    @Override
    public String toString() {
        return "Выбирите пожалуйста вид товара: "
                + "1 -" + PHONS_AND_TABLETS + "2 -" + TV + "3 -" + LAPTOP + "4 -" + SSD;
    }
}

