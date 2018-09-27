package jenericObject;

import jenericObject.head.SmallHead;

public class MAin {
    public static void main(String[] args) {
        Body body = new Body();
        SmallHead smallHead = new SmallHead();
//        Robot<Body, SmallHead> robot = new Robot<Body,SmallHead>(body,smallHead);
//        robot.getHead().turn();
        BigLeag bigLeag = new BigLeag();

        Robot <SmallHead, BigLeag> robot1 = new Robot(body, bigLeag);
    }
}
