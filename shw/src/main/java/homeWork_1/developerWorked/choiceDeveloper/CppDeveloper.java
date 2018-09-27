package homeWork_1.developerWorked.choiceDeveloper;

import homeWork_1.developerWorked.interfacesFile.Developer;
import homeWork_1.developerWorked.interfacesFile.Human;

public class CppDeveloper implements Developer, Human {

    public boolean pragramerLangyage(String progLangyage) {
        if (progLangyage.equals("Java")) {
            return true;
        }
        return false;
    }

    @Override
    public void breathe() {

    }
}
