package homeWork_20_eatMenu;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\Артемка\\IdeaProjects\\HomeWork\\src\\main\\java\\homeWork_20_eatMenu\\menu.txt";
        FileReadMenu fileReadMenu = new FileReadMenu(fileName);
        String meal = fileReadMenu.readAndPrintMenuAndPickMeal();
        fileReadMenu.totalBill(meal);
    }
}
