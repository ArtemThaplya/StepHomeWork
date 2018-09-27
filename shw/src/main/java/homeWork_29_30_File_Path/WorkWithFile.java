package homeWork_29_30_File_Path;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.Callable;

public class WorkWithFile {
    static Callable callable(URL url, File file) {
        return () -> {
            try {
                FileUtils.copyURLToFile(url, file);
            } catch (IOException e) {
                e.printStackTrace();
            }

            return checkingForFile(file);
        };
    }

    private static boolean checkingForFile(File file) {
        if ((new File(String.valueOf(file))).exists()) {
            System.out.println("Файл существует!");
            return true;
        } else {
            System.out.println("Файл не найде!");
        }
        return false;
    }
}
