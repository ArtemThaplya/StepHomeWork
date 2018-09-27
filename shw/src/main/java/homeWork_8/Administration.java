package homeWork_8;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Administration {
    private TelophoneStation telophoneStation = new TelophoneStation();
    private CheckPositiveBalance checkPositiveBalance = new CheckPositiveBalance();
    private Scanner scanner = new Scanner(System.in);
    private Date date = new Date();
    static AbonentBase[] abonentIdNow;
    private int idClient;

    void refuseServiMenu() {
        telophoneStation.base();
        System.out.println("Введите пожалуйста номер лицевого счета: ");
        try {
            idClient = Integer.parseInt(scanner.nextLine());
        } catch (InputMismatchException | NumberFormatException ex) {
            System.out.println("Вы ввели не cуществующий лицевой счет. \n Проверьте номер и введите еще раз!");
            // TODO: 06.04.2018  зацикленность при исключительной ситуации.
            refuseServiMenu();
        }
        menuServise();
    }

    private void menuServise() {

        try {
            abonentIdNow = new AbonentBase[]{identificationAbonent(idClient)};
            checkPositiveBalance.checkBalance(abonentIdNow[0], (int) abonentIdNow[0].getBalans());
        } catch (NullPointerException ex) {
            System.out.println("Вы ввели не существующий лицевой счет." +
                    "Проверьте номер и введите еще раз!");
            refuseServiMenu();
        }
        System.out.println(toString());     // выбрать раздел меню
        int num = scanner.nextInt();


        switch (num) {
            case 1:
                System.out.println("Ваш баланс: " + abonentIdNow[0].getBalans() + ". " + date.toString());
                break;
            case 2:
                System.out.println("Введите сумму для пополнения: ");
                int money = scanner.nextInt();
                abonentIdNow[0].setBalans((int) abonentIdNow[0].getBalans() + money);
                System.out.println("Пополнение прошло успешно! Ваш баланс: " + abonentIdNow[0].getBalans());
                break;
            case 3:
                System.out.println("Введите новый номер: ");
                long newNumber = scanner.nextLong();
                abonentIdNow[0].setNomer(newNumber);
                int newBallance = (int) abonentIdNow[0].getBalans() - 70;
                System.out.println("Ваш новый номер: " + abonentIdNow[0].getNomer()
                        + "\n Стоимость услуги 70 грн. Ваш текущий баланс: " + newBallance);
                abonentIdNow[0].setBalans(newBallance);
                break;
            case 4:
                abonentIdNow[0].setStatus(refuse());
                break;
            case 5:
                System.exit(0);
        }
        menuServise();
    }

    private AbonentBase identificationAbonent(int id) {
        AbonentBase result = null;
        for (AbonentBase a : telophoneStation.abonentBase) {
            if (a.getId().equals(id)) {
                result = a;
            }
        }
        return result;
    }

    boolean refuse() {
        System.out.println("Вы хотетие отказаться от услуги MusicBox? (1-да, 2-нет)");
        int input = scanner.nextInt();
        if (input == 1) {
            System.out.println("Услуга MusicBox отключена!");
            return false;
        } else return true;
    }

    @Override
    public String toString() {
        return "Menu: \n"
                + "1. Проверка баланса.\n"
                + "2. Пополнить счет.\n"
                + "3. Смена номера(стоимось 70 грн).\n"
                + "4. Изменени услуг.\n"
                + "5. Выход.";
    }
}
