package homeWork_3;

import java.util.GregorianCalendar;

public class Information {
    private Student student1 = new Student("Tsaplya", 1991, 5, 4, 5);
    private Student student2 = new Student("Bobrov", 1995, 3, 4, 4);
    private Student student3 = new Student("Kravec", 1990, 2, 3, 3);
    private Student[] students = {student1, student2, student3};


    public void studentGroup() {
        for (Student s : students) {
            float result = (float) (s.getMarkOne() + s.getMarkTwo() + s.getMarkThree()) / 3;
            System.out.println("Фамилия: " + s.getSecondName() + ". Год рождения: " + s.getYear()
                    + ". Оценки: " + s.getMarkOne() + " " + s.getMarkTwo() + " "
                    + s.getMarkThree() + ". Средний бал: " + result + ".");
        }
    }
}
