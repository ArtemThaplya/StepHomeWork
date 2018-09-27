package homeWork_29_30_File_Path;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DownloadingInformation {
    private Path path;
    private long sizeFile;
    private File file;

    String informationAboutFile(File file) {
        this.file = file;
        path = Paths.get(String.valueOf(file));
        sizeFile = file.length();
        System.out.println(toString());
        return path + file.getName() + sizeFile;
    }

    @Override
    public String toString() {
        return "Path:  " + path
                + "  Name:  " + file.getName()
                + "  Size:  " + sizeFile;
    }
}
