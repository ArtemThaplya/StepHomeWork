package homeWork_29_30_File_Path;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
        DownloadingInformation down = new DownloadingInformation();
        final URL url = new URL("https://wallpaper.mob.org.ru/image/downloadImage?id=41314&l=160&t=0&r=388&b=415&s=0.5937834941050375");
        final String nameFile1 =
                "C:\\Users\\Артемка\\IdeaProjects\\HomeWork\\src\\main\\java\\homeWork_29_30_File_Path\\1.jpg";

        final String nameFile2 =
                "C:\\Users\\Артемка\\IdeaProjects\\HomeWork\\src\\main\\java\\homeWork_29_30_File_Path\\2.jpg";
        final String nameFile3 =
                "C:\\Users\\Артемка\\IdeaProjects\\HomeWork\\src\\main\\java\\homeWork_29_30_File_Path\\3.jpg";

        File pathFile1 = new File(nameFile1);
        File pathFile2 = new File(nameFile2);
        File pathFile3 = new File(nameFile3);
        ExecutorService executor = Executors.newWorkStealingPool();

        List callables = Arrays.asList(
                WorkWithFile.callable(url, pathFile1),
                WorkWithFile.callable(url, pathFile2),
                WorkWithFile.callable(url, pathFile3));

        executor.invokeAny(callables);
        down.informationAboutFile(pathFile1);
        down.informationAboutFile(pathFile2);
        down.informationAboutFile(pathFile3);
    }

}
