package homeWork_23_24_Alisa;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.nio.file.Files.*;
import static java.nio.file.Paths.*;

public class RepeatedWordsCounter {

    private static final int MIN_WORD_LENGTH = 3;
    private static final String SPECIAL_CHARACTERS_AND_NUMBERS = "[-+^.,<>@:;!?/*#$%&()_{}=0123456789~`']*";
    private static final int TOP_TEN_WORDS = 10;

    void readFileAndPrintRepeatedWords(String fileName) throws IOException, URISyntaxException {
        printMappedWorldsToFrequency(readFileAndGetWords(fileName));
    }

    private List<String> readFileAndGetWords(String fileName) throws IOException, URISyntaxException {
        return lines(get(getClass().getResource(fileName).toURI()), StandardCharsets.UTF_8)
                .map(s -> s.replaceAll(SPECIAL_CHARACTERS_AND_NUMBERS, "").trim())
                .map(line -> line.split("\\s"))
                .flatMap(Arrays::stream)
                .filter(s -> s.length() > MIN_WORD_LENGTH)
                .collect(Collectors.toList());
    }

    private void printMappedWorldsToFrequency(List<String> collectList) {
        collectList.stream()
                .collect(Collectors.toMap(Function.identity(), i -> Collections.frequency(collectList, i), (k1, k2) -> k2))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(TOP_TEN_WORDS)
                .forEach(System.out::println);
    }
}
