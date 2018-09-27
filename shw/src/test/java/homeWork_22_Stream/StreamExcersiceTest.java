package homeWork_22_Stream;

import homeWork_22_Stream.StreamExcersice.Sex;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StreamExcersiceTest {

    @Test
    public void ex01Test() {
        List<StreamExcersice.Student> solders = Arrays.asList(
                new StreamExcersice.Student("Петя", 23, Sex.MAN),
                new StreamExcersice.Student("Дима", 25, Sex.MAN)
        );
        assertThat(StreamExcersice.ex01(), is(solders));
    }

    @Test
    public void ex02Test() {
        int averageAge = 38;
        assertThat(StreamExcersice.ex02(), is(averageAge));
    }

    @Test
    public void ex03Test() {
        List<StreamExcersice.Student> workers = Arrays.asList(
                new StreamExcersice.Student("Петя", 23, Sex.MAN),
                new StreamExcersice.Student("Соня", 18, Sex.WOMEN),
                new StreamExcersice.Student("Дима", 25, Sex.MAN),
                new StreamExcersice.Student("Катя", 21, Sex.WOMEN),
                new StreamExcersice.Student("Семен", 33, Sex.MAN),
                new StreamExcersice.Student("Елена", 42, Sex.WOMEN)
        );
        assertThat(StreamExcersice.ex03(), is((long) workers.size()));
    }

    @Test
    public void ex04Test() {
        List<StreamExcersice.Student> sortedStudents = Arrays.asList(
                new StreamExcersice.Student("Вася", 16, Sex.MAN),
                new StreamExcersice.Student("Виктор Петрович", 65, Sex.MAN),
                new StreamExcersice.Student("Дима", 25, Sex.MAN),
                new StreamExcersice.Student("Елена", 42, Sex.WOMEN),
                new StreamExcersice.Student("Иван Иванович", 69, Sex.MAN),
                new StreamExcersice.Student("Катюха", 56, Sex.WOMEN),
                new StreamExcersice.Student("Катя", 21, Sex.WOMEN),
                new StreamExcersice.Student("Петя", 23, Sex.MAN),
                new StreamExcersice.Student("Семен", 33, Sex.MAN),
                new StreamExcersice.Student("Соня", 18, Sex.WOMEN)
        );
        assertThat(StreamExcersice.ex04(), is(sortedStudents));
    }

    @Test
    public void ex05Test() {
        StreamExcersice.Student oldestStudent = new StreamExcersice.Student("Иван Иванович", 69, Sex.MAN);
        assertThat(StreamExcersice.ex05(), is(oldestStudent));
    }

    @Test
    public void ex06Test() {
        StreamExcersice.Student youngerStudent = new StreamExcersice.Student("Вася", 16, Sex.MAN);
        assertThat(StreamExcersice.ex06(), is(youngerStudent));
    }
}