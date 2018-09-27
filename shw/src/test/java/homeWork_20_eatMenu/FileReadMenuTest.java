package homeWork_20_eatMenu;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class FileReadMenuTest {
    private String fileNameTwo = "C:\\Users\\Артемка\\IdeaProjects\\HomeWork\\src\\test\\resources\\homeWork_20_eatMenu\\testmenu.txt";
    private String fileName = "testmenu.txt";

    @Test
    public void bill() throws IOException {
        FileReadMenu fileReadMenu = new FileReadMenu(fileName);
        int expected = 360;
        int actual = fileReadMenu.bill("Суп Суп Суп");
        assertEquals(expected, actual);
    }

    @Test
    public void readFileTest() throws IOException {
        FileReadMenu fileReadMenu = new FileReadMenu(fileNameTwo);
        List<String> actualMeal = fileReadMenu.readFile(fileNameTwo);
        List<String> expectedMeal = new ArrayList<>();
        expectedMeal.add("Чай 30");
        expectedMeal.add("Кофе 35");
        assertEquals(expectedMeal,actualMeal);
    }
}