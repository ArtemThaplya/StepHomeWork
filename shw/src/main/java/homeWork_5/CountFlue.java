package homeWork_5;

import homeWork_5.plane.Airbus;
import homeWork_5.plane.Antonov;
import homeWork_5.plane.Boeing;

import java.util.Scanner;

public class CountFlue {
    private Boeing boeing = new Boeing();
    private Airbus airbus = new Airbus();
    private Antonov antonov = new Antonov();
    private Scanner scanner = new Scanner(System.in);

    public void flue() {
        System.out.println("Введите количество горючего," +
                " кторое должно помещаться в самолете в диапазоне от 0 до 290600," +
                " а мы подберем подходящий самолет: ");
        int count = scanner.nextInt();
        if (count <= 183380){
            System.out.println("Вам подходит: " + boeing.toString());
        } else if (count > 183380 && count < 248700){
            System.out.println("Вам подходит: " + airbus.toString());
        } else System.out.println("Вам подходит: " + antonov.toString());
    }
}
