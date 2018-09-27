package homeWork_14_InternetMagaz.admin;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class AddTovar {
    public ArrayList<Tovar> list = new ArrayList<>();   //todo  Телевизоры не сохраняются в колекцию
    private Scanner scanner = new Scanner(System.in);
    private Tovar tovar;

    public void dobavimTovar() {
        System.out.println("Добавьте товар!");
        String name = inputName();
        int price = inputPrice();
        int count = inputCount();
        tovar = new Tovar(name, price, count);
        InnerArray<Tovar> inner = new InnerArray<>();
        inner.saveTovar(tovar);
        String st;
        System.out.println("Если хотите добавить товар введите 1, если  нет, введите 2");
        st = scanner.nextLine();
        if (st.equals("1")) {
            dobavimTovar();
        }
    }

    private int inputCount() {
        System.out.println("Введите количество товара!");
        int count = 0;
        try {
            count = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException | InputMismatchException e) {
            System.out.println("Ошибка ввода! Введите количество товара!  " + e);
            inputCount();
        }
        return count;
    }

    private int inputPrice() {
        System.out.println("Введите цену товара!");
        int price = 0;
        try {
            price = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException | InputMismatchException e) {
            System.out.println("Ошибка ввода! Введите цену товара!  " + e);
            inputPrice();
        }
        return price;
    }

    private String inputName() {
        System.out.println("Введите название призводителя товара!");
        String name = null;
        try {
            name = scanner.nextLine();
        } catch (NumberFormatException | InputMismatchException e) {
            System.out.println("Ошибка ввода! Введиете название модели!  " + e);
            inputName();
        }
        return name;
    }

    class InnerArray<E extends Tovar> {
        void saveTovar(E tovar) {
            list.add(tovar);
        }
    }

    public void printOurTovar() {
        System.out.println("Все телевизоры: ");
        for (Tovar aList : list) {
            System.out.println("Name: " + aList.getName()
                    + ", price: " + aList.getPrice()
                    + ", count: " + aList.getCount() + ".\n"
                    + "******************************************************************");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddTovar addTovar = (AddTovar) o;
        return Objects.equals(list, addTovar.list) &&
                Objects.equals(scanner, addTovar.scanner) &&
                Objects.equals(tovar, addTovar.tovar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(list, scanner, tovar);
    }
}
