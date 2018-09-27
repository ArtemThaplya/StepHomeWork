package homeWork_14_InternetMagaz;

import homeWork_14_InternetMagaz.Smartphone;
import homeWork_14_InternetMagaz.admin.AddTovar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Administration {
    private final static int PASSWORD = 1234;
    private AddTovar addTovar = new AddTovar();
    private Scanner scanner = new Scanner(System.in);
    public String[] array = new String[4];

    public void login() {
        System.out.println("Введите логин Администратора(1234 - если пароль введен не верно, " +
                "будет продолженная работа с магазином): ");
        int loginPassword = 0;
        try {
            loginPassword = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Введите коректные данные!" + e);
        }
        if (PASSWORD == loginPassword) {
            System.out.println(toString() + "Выберете раздел меню: ");
            int a = scanner.nextInt();
            switch (a) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    registrationSale();
                    break;
            }
        } else {
            Smartphone smartphone = new Smartphone();
            smartphone.hellowFrame();
        }
    }

    public void addProduct() {
//        System.out.println("Введите модель, цену, диагональ и количество телевизоров(через пробел): ");
//        String list = String.valueOf(scanner.hasNext());
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = String.valueOf(list.split(" "));
//        }
//        TV tv = new TV(array[0], array[1], array[2], array[3]);
//        System.out.print(tv.toString() + "  \n");
        addTovar.dobavimTovar();
        addTovar.printOurTovar();
        Smartphone smartphone = new Smartphone();
        smartphone.hellowFrame();
    }

    public void registrationSale() {
        try {
            if (array[3].equals("0")) {
                System.out.println("Весь товар продан.");
            } else array[3] = String.valueOf(Integer.parseInt(array[3]) - 1);
        } catch (NullPointerException e) {
            System.out.println("Товар закончился!" + e);
            login();
        }
    }

    @Override
    public String toString() {
        return "1 - Добавить товар. \n2 - Регистрация продажи товара. \n";
    }
}
