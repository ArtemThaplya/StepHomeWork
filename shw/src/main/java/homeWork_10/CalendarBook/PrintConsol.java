package homeWork_10.CalendarBook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Locale;

public class PrintConsol {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
    private SimpleDateFormat simpleFormat1 = new SimpleDateFormat("dd/MM/yyyy");
    private SimpleDateFormat simpleFormat2 = new SimpleDateFormat("dd MMM, yyyy", Locale.UK);
    private SimpleDateFormat simpleFormat3 = new SimpleDateFormat("EEEE", Locale.UK);

    private SimpleDateFormat formatDays = new SimpleDateFormat("dd");
    private SimpleDateFormat formatMonth = new SimpleDateFormat("MM");
    private SimpleDateFormat formatYears = new SimpleDateFormat("yyyy");


    private DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, Locale.UK);
    private Date date;
    private Date dateOne;
    private Date dateTwo;


    void inputDate() throws IOException, ParseException {
        date = simpleFormat1.parse(reader.readLine());
        System.out.println(toString());
    }

    void inputTwoDate() throws IOException, ParseException {
        System.out.println("Для подсчет количества дней и месяцев, " +
                "задайте временной промежуток. Первая дата: ");
        dateOne = simpleFormat1.parse(reader.readLine());
        System.out.println("Вторая дата: ");
        dateTwo = simpleFormat1.parse(reader.readLine());
        differenceDays();
        differenceMonth();

    }

    private void differenceDays() {
        long differenceDate = dateTwo.getTime() - dateOne.getTime();
        long result = differenceDate / (24 * 60 * 60 * 1000);
        System.out.println("Количество дней в заданном промежутке: " + result);
    }

    private void differenceMonth() {
        int y = Integer.parseInt(formatYears.format(dateOne));
        int m = Integer.parseInt(formatMonth.format(dateOne));
        int d = Integer.parseInt(formatDays.format(dateOne));

        int y2 = Integer.parseInt(formatYears.format(dateTwo));
        int m2 = Integer.parseInt(formatMonth.format(dateTwo));
        int d2 = Integer.parseInt(formatDays.format(dateTwo));

        LocalDate localDate1 = LocalDate.of(y, m, d);
        LocalDate localDate2 = LocalDate.of(y2, m2, d2);
        Period period = Period.between(localDate1, localDate2);
        String periodString = String.valueOf(period);
        Period countMonth = Period.parse(periodString);
        System.out.println("Количество месяцев в заданном промежутке: "
                + (countMonth.toTotalMonths() + 1) );
    }

    @Override
    public String toString() {
        return dateFormat.format(date) + " -- Первый вариант вывода!\n"
                + simpleFormat2.format(date).toUpperCase() + " -- Второй вариант вывода!\n"
                + df.format(date) + " -- Третий вариант вывода!\n" +
                simpleFormat3.format(date).toUpperCase() + " -- День недели по заданной дате!";
    }
}