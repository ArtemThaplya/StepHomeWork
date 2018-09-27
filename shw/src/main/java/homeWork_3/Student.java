package homeWork_3;

import java.util.Arrays;

public class Student {
    private String secondName;
    private int year;
    private int markOne;
    private int markTwo;
    private int markThree;

    Student(String secondName, int year, int markOne, int markTwo, int markThree) {
        this.secondName = secondName;
        this.year = year;
        this.markOne = markOne;
        this.markTwo = markTwo;
        this.markThree = markThree;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getYear() {
        return year;
    }

    public int getMarkOne() {
        return markOne;
    }

    public int getMarkTwo() {
        return markTwo;
    }

    public int getMarkThree() {
        return markThree;
    }
}
