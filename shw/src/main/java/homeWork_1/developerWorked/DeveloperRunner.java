package homeWork_1.developerWorked;

import homeWork_1.developerWorked.choiceDeveloper.JavaDeveloper;

public class DeveloperRunner {

    private JavaDeveloper javaDeveloper = new JavaDeveloper(true, "Артем", 26, true, "Java");
    private JavaDeveloper javaDeveloper1 = new JavaDeveloper(true, "Дима", 56, true, "Java");
    private JavaDeveloper javaDeveloper2 = new JavaDeveloper(true, "Коля", 31, false, "C++");

    public void developerRunner() {
            javaDeveloper.breathe();
            javaDeveloper1.breathe();
            javaDeveloper2.breathe();
    }

}
