package homeWork_2.Figure;

import homeWork_2.Menu;

import java.util.Scanner;

public class VolBlock extends Menu {
    private Scanner scanner = new Scanner(System.in);
    private int blockVol;
    private int a;
    private int b;
    private int h;
    private double blockArea;


    public void volBlock() {

        System.out.println("Введите, пожалуйста, длину, ширину и высоту блока(Каждый параметр отделяйте вводом, Enter): ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        h = scanner.nextInt();
        vol();
        area();
    }

    public double vol() {
        blockVol = a * b * h;
        return blockVol;
    }

    public double area() {
        blockArea = 2 * (a * b + a * h + b * h);
        return blockArea;
    }

    @Override
    public String toString() {
        return "Введенные данные для Блока: длина блока " + a
                + ",  ширина " + b + ", высота " +
                h + ". Объем блока: " +
                blockVol + ". Площадь блока: " + blockArea +
                ". \n_______________________________________________________________";
    }
}
