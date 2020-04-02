package homeWork_31;

import homeWork_31.impMethodRobot.LgHand;
import homeWork_31.impMethodRobot.SonyHead;
import homeWork_31.impMethodRobot.ToshibaLag;

public class ImplementRobot {
    private SonyHead sonyHead;
    private LgHand lgHand;
    private ToshibaLag toshibaLag;

    public ImplementRobot() {
    }

    public ImplementRobot(SonyHead sonyHead, LgHand lgHand, ToshibaLag toshibaLag) {
        this.sonyHead = sonyHead;
        this.lgHand = lgHand;
        this.toshibaLag = toshibaLag;
    }

    void move(){
        sonyHead.think();
        lgHand.put();
        toshibaLag.go();
    }

}
