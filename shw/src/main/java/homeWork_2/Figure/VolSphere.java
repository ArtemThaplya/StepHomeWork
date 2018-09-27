package homeWork_2.Figure;

import homeWork_2.Menu;

import java.util.Scanner;

public class VolSphere extends Menu {
    private double sphereVol;
    private double sphereArea;
    private int r;

    private Scanner scanner = new Scanner(System.in);

    public void volSphere() {
        System.out.println("Введите, пожалуйста, радиус сферы: ");
        r = scanner.nextInt();
        vol();
        area();
    }

    public double vol() {
        sphereVol = (4 / 3) * Math.PI * Math.pow(r, 3);
        return sphereVol;
    }

    public double area() {
        sphereArea = Math.pow(4, Math.PI) * Math.pow(r, 2);
        return sphereArea;
    }

    @Override
    public String toString() {
        return "Введенные данные для Сферы: радиус " + r +
                ". Объем сферы: " + sphereVol + ". Площадь сферы: "
                + sphereArea + ". \n_______________________________________________________________";
    }
}
