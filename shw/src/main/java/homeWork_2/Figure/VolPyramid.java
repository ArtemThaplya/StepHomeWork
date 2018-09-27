package homeWork_2.Figure;

import homeWork_2.Menu;

import java.util.Scanner;

public class VolPyramid extends Menu {
    private int a;
    private int h;
    private int b;
    private double pyramidaVol;
    private double pyramidaArea;
    private Scanner scanner = new Scanner(System.in);

    public void volPyramid() {
        System.out.println("Введите, пожалуйста, длину и ширину основания, а затем высоту пирамиды(Каждый параметр отделяйте вводом, Enter): ");
        a = scanner.nextInt();
        h = scanner.nextInt();
        b = scanner.nextInt();
        vol();
        area();
    }

    public double vol() {
        pyramidaVol = (0.5 * a * h * b) / 3;
        return pyramidaVol;
    }

    public double area() {
        pyramidaArea = 9999;
        return pyramidaArea;
    }

    @Override
    public String toString() {
        return "Введенные данные для пирамиды: длина основания " + a
                + ", ширина основания " + h + ", высота пирамиды " + b
                + ". Объем пирамиды: " + pyramidaVol + ". Площадь пирамиды: "
                + pyramidaArea + ".\n_______________________________________________________________";
    }
}
