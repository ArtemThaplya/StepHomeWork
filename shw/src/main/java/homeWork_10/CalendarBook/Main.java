package homeWork_10.CalendarBook;

import java.io.IOException;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        PrintConsol printConsol = new PrintConsol();
        printConsol.inputDate();
        printConsol.inputTwoDate();
    }
}
