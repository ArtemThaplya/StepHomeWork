package homeWork_12_planeExceptions;

import homeWork_12_planeExceptions.plane.Airbus;
import homeWork_12_planeExceptions.plane.Antonov;
import homeWork_12_planeExceptions.plane.Boeing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CountFlue {
    private Boeing boeing = new Boeing();
    private Airbus airbus = new Airbus();
    private Antonov antonov = new Antonov();
    private Scanner scanner = new Scanner(System.in);
    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public void flue()  {
        System.out.println("Введите количество горючего," +
                " кторое должно помещаться в самолете в диапазоне от 0 до 290600," +
                " а мы подберем подходящий самолет: ");
        int count = 0;
        try {
            count = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }catch (NumberFormatException ex){
            System.out.println("Введите корекное занчение!" + "\nВвод: ");
            try {
                count = Integer.parseInt(bufferedReader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

            if (count <= 183380) {
                System.out.println("Вам подходит: " + boeing.toString());
            } else if (count > 183380 && count < 248700) {
                System.out.println("Вам подходит: " + airbus.toString());
            } else System.out.println("Вам подходит: " + antonov.toString());
        }
    }
