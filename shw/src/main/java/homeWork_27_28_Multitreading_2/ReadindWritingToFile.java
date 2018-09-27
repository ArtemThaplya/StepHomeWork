package homeWork_27_28_Multitreading_2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReadindWritingToFile extends Thread {
    private final String nameFileIn = "Input.txt";
    private final String nameFileOut = "Output.txt";
    private List<String> list = new ArrayList<>();

    void someImplementations() {
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        list = Files.lines(Paths
                                .get(getClass()
                                        .getResource(nameFileIn)
                                        .toURI()), StandardCharsets.UTF_8)
                                .collect(Collectors.toList());
                        for (String st : list) {
                            Thread.currentThread().join();
                            System.out.println(st);
                            Thread.sleep(200);
                        }
                    } catch (IOException | URISyntaxException | InterruptedException e) {
                        e.printStackTrace();
                    }
                    try {
                        FileWriter fileWriter = new FileWriter(nameFileOut);
                        fileWriter.write(String.valueOf(list));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }
}
