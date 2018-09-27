package homeWork_20_eatMenu;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FileReadMenu {
    private final Order order = new Order();
    private final String fileName;

    public FileReadMenu(String fileName) {
        this.fileName = fileName;
    }

    public String readAndPrintMenuAndPickMeal() throws IOException {
        List<String> list = readFile(fileName);
        for (String ls : list) {
            System.out.println(ls);
        }
        return order.inputOrder();
    }

    List<String> readFile(final String fileName) throws IOException {
        final FileReader fileReader = new FileReader(fileName);
        final Scanner scanner = new Scanner(fileReader);
        final List<String> list = new ArrayList<>();
        while (scanner.hasNextLine()){
            list.add(scanner.nextLine());
        }
        fileReader.close();
        return list;
    }

    void totalBill(String meal) throws IOException {
        int mealBill = bill(meal);
        if (mealBill > 1500) {
            double result = mealBill * 0.85;
            System.out.println("Ващ счет, с учетом скидки 15%: " + result
                    + "\nРекомендуемая сумма чаевых: " + Math.floor(result * 0.10));
        }
        if (mealBill < 1500 && mealBill > 1000) {
            double result = mealBill * 0.90;
            System.out.println("Ващ счет, с учетом скидки 10%: " + result
                    + "\nРекомендуемая сумма чаевых: " + Math.floor(result * 0.10));
        }
        if (mealBill < 1000 && mealBill > 500) {
            double result = mealBill * 0.95;
            System.out.println("Ващ счет, с учетом скидки 5%: " + result
                    + "\nРекомендуемая сумма чаевых: " + Math.floor(result * 0.10));
        }
        if (mealBill < 500) {
            System.out.println("Ващ счет: " + mealBill
                    + "\nРекомендуемая сумма чаевых: " + Math.floor(mealBill * 0.10));
        }
    }

    private Map<String, Integer> createMenuFromFile(String fileName) throws IOException {
        final Map<String, Integer> mapMenu = new TreeMap<>();
        List<String> list = readFile(fileName);
        for (String s : list) {
            String[] words = s.split("\\s");
            mapMenu.put(words[0], Integer.valueOf(words[1]));
        }
        return mapMenu;
    }

    public int bill(String meal) throws IOException {
        Map<String, Integer> mapMenu = createMenuFromFile(fileName);
        String[] eat = meal.split("\\s");
        int billResult = 0;
        System.out.println("Ваш заказ: ");
        for (String anEat : eat) {
            Integer currentBill = mapMenu.get(anEat);
            if (currentBill == null) {
                currentBill = 0;
            }
            billResult += currentBill;
            System.out.print(anEat + " " + currentBill + "\n");
        }
        return billResult;
    }
}
