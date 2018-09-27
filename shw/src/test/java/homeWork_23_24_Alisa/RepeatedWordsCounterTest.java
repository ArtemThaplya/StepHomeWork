package homeWork_23_24_Alisa;

import org.junit.Test;

import java.io.IOException;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedWordsCounterTest {
    @Test
    public void name() throws Exception {
        String fileName = "C:\\Users\\Артемка\\IdeaProjects\\HomeWork\\src\\main\\resources\\alicet.txt";
        RepeatedWordsCounter repeatedWordsCounter = new RepeatedWordsCounter();
        repeatedWordsCounter.readFileAndPrintRepeatedWords(fileName);
    }

    @Test
    public void name3() {
        List<String> numbers = new LinkedList<>(Collections.singleton("lewis lewis lewis artem artem lera lera lera lera lera"));
        List<String> collectList = numbers.stream()
                .map(s -> s.split("\\s"))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
        collectList.stream()
                .collect(Collectors.toMap(Function.identity(), i ->  Collections.frequency(collectList, i), (k1, k2) -> k2))
                .forEach((s, d) -> System.out.println(s + " : "+ d));

    }
}