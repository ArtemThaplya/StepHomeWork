package homeWork_22_Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamExcersice implements Cloneable {

    enum Sex {
        MAN,
        WOMEN
    }

    static class Student {
        private final String name;
        private final Integer age;
        private final Sex sex;

        public Student(String name, Integer age, Sex sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public int compareTo(Student other) {
            return name.compareTo(other.name);
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public Sex getSex() {
            return sex;
        }

        @Override
        public String toString() {
            return "{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", sex=" + sex +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Student)) return false;
            Student people = (Student) o;
            return Objects.equals(name, people.name) &&
                    Objects.equals(age, people.age) &&
                    Objects.equals(sex, people.sex);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, sex);
        }
    }

    static List<Student> students = Arrays.asList(
            new Student("Вася", 16, Sex.MAN),
            new Student("Петя", 23, Sex.MAN),
            new Student("Соня", 18, Sex.WOMEN),
            new Student("Виктор Петрович", 65, Sex.MAN),
            new Student("Дима", 25, Sex.MAN),
            new Student("Катюха", 56, Sex.WOMEN),
            new Student("Катя", 21, Sex.WOMEN),
            new Student("Семен", 33, Sex.MAN),
            new Student("Елена", 42, Sex.WOMEN),
            new Student("Иван Иванович", 69, Sex.MAN)
    );

    public static class NameComparator implements Comparator<Student> {
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    public static class AgeComparator implements Comparator<Student> {
        public int compare(Student o1, Student o2) {
            return o1.getAge().compareTo(o2.getAge());
        }
    }

    static List<Student> ex01() {
        List<Student> arr = students
                .stream()
                .filter(st -> st.sex.equals(Sex.MAN) && st.age >= 18 && st.age <= 27)
                .collect(Collectors.toList());
        System.out.println(arr);
        return arr;

        // TODO: Задание 1
        // Выбрать всех мужчин-военнообязанных (возраст от 18 до 27 лет)
    }

    static int ex02() {
        int countMan = (int) students.stream()
                .filter(st -> st.sex.equals(Sex.MAN))
                .count();
        int allAge = students.stream()
                .filter(st -> st.sex.equals(Sex.MAN))
                .mapToInt(st -> st.age)
                .sum();
        System.out.println("Средний возраст среди мужчин: " + allAge / countMan);
        return allAge / countMan;

        // TODO: Задание 2
        // Найти средний возраст среди мужчин
    }

    static Long ex03() {
        long countMan = students
                .stream()
                .filter(x -> (x.sex.equals(Sex.MAN) && x.age >= 18 && x.age <= 60) || (x.sex.equals(Sex.WOMEN) && x.age >= 18 && x.age <= 55))
                .count();
        System.out.println("Количество потенциально работоспособных: " + countMan);
        return countMan;

        // TODO: Задание 3
        // Найти кол-во потенциально работоспособных
        // студентов в выборке (т.е. от 18 лет и учитывая
        // что женщины выходят в 55 лет, а мужчина в 60)
    }

    static List<Student> ex04() {
        students.sort(new NameComparator());
        System.out.println(students);
        return students;

        // TODO: Задание 4
        // Отсортировать студентов по имени в обратном алфавитном порядке
    }


    static Student ex05() {
        students.sort(new AgeComparator());
        System.out.println(students.get(students.size() - 1));
        return students.get(students.size() - 1);

        //  TODO: Задание 5
        //  найти студента с максимальным возрастом
    }

    static Student ex06() {
        students.sort(new AgeComparator());
        System.out.println(students.get(0));
        return students.get(0);

        // TODO: Задание 6
        // Найти студента с минимальным возрастом
    }

    public static void main(String[] args) {
        // TODO: тестировать здесь
    }
}
