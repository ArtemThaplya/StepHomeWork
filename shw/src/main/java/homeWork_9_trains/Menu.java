package homeWork_9_trains;


import homeWork_9_trains.trains.Premium;
import homeWork_9_trains.trains.TypeTrains;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Menu {
    private Random random = new Random();
    private TypeTrains type = new TypeTrains();
    private Scanner scanner = new Scanner(System.in);
    private int input;


    void printMenu() {
        System.out.println("Выбранный тип поезда И+. " +
                "Выбирете номер вагона, введите соответствующую цифру" +
                "(1-Премиум, 2-Дешевый, 3-Купе, 4- Сидячий вагон):");
        int number = catchException();
        String typeVagon = type.typeVagon(number);
        System.out.println("Вы выбрали тип вагона: " + typeVagon + ".\n"
                + "Вы будите покупать билет(1 - да,  2 - нет)?");
        int choise = catchException();
        if (choise == 1) {
            type.typeChangeTrain(number);
            int mesto = catchException();
            System.out.println("Спасибо за покупку. Ваше место: " + mesto
                    + " Вы можете обменять билет в кассе, по это номеру "
                    + random.nextInt(999999));
        } else System.out.println("Спасибо что уделили время. Зайдите позже, " +
                "возможно появятся новые места, которые вас устроят!");
    }

    private int catchException() {
        try {
            input = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException | InputMismatchException e) {
            System.out.println("Введите числовое значение.    " + e);
            catchException();
        }
        return input;
    }
}
