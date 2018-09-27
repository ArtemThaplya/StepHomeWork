package homeWork_2;

import homeWork_2.Figure.VolBlock;
import homeWork_2.Figure.VolPyramid;
import homeWork_2.Figure.VolSphere;

import java.util.Random;
import java.util.Scanner;

public class GetInformation {
    private VolBlock volBlock = new VolBlock();
    private VolSphere volSphere = new VolSphere();
    private VolPyramid volPyramid = new VolPyramid();
    private Random rnd = new Random();
    private int resultVol;
    private int resultArea;

    public void begin() {
        for (int i = 0; i < 10; i++) {
            int current = rnd.nextInt(2);
            switch (current) {
                case 0:
                    volBlock.volBlock();
                    System.out.println(volBlock.toString());
                    resultVol += volBlock.vol();
                    resultArea += volBlock.area();
                case 1:
                    volSphere.volSphere();
                    System.out.println(volSphere.toString());
                    resultVol += volSphere.vol();
                    resultArea += volSphere.area();
                case 2:
                    volPyramid.volPyramid();
                    System.out.println(volPyramid.toString());
                    resultVol += volPyramid.vol();
                    resultArea += volPyramid.area();
            }
        }
        System.out.println("Средний объем всех введенных фигур: " + resultVol/10
                + ". Средняя площадь всех введенных Фигур: " + resultArea/10);
    }


    @Override
    public String toString() {
        return "";
    }
}
