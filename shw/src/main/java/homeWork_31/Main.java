package homeWork_31;

import homeWork_31.impMethodRobot.LgHand;
import homeWork_31.impMethodRobot.SonyHead;
import homeWork_31.impMethodRobot.ToshibaLag;

public class Main {
    public static void main(String[] args) {
        SonyHead sonyHead = new SonyHead();
        LgHand lgHand = new LgHand();
        ToshibaLag toshibaLag = new ToshibaLag();

        ImplementRobot implementRobot = new ImplementRobot(sonyHead, lgHand,toshibaLag);
        implementRobot.move();
    }
}
