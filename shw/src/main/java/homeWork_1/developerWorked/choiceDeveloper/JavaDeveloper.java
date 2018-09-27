package homeWork_1.developerWorked.choiceDeveloper;

import homeWork_1.developerWorked.choiceDeveloper.CppDeveloper;
import homeWork_1.developerWorked.interfacesFile.Developer;
import homeWork_1.developerWorked.interfacesFile.Human;

public class JavaDeveloper implements Developer, Human {
    private boolean canBreathe;
    private String name;
    private int age;
    private boolean writeCode;
    private String progLangyage;


    private CppDeveloper cppDeveloper = new CppDeveloper();

    public JavaDeveloper(boolean canBreathe, String name, int age, boolean writeCode, String progLangyage) {
        this.canBreathe = canBreathe;
        this.name = name;
        this.age = age;
        this.writeCode = writeCode;
        this.progLangyage = progLangyage;
    }

    @Override
    public void breathe() {
        boolean result = cppDeveloper.pragramerLangyage(progLangyage);
        if (canBreathe && enjoyingLife() && writeCode() && result) {
            System.out.println(toString());
        } else System.out.println(name + " вы нам не подходите!");
    }

    @Override
    public boolean writeCode() {
        if (writeCode) {
            return true;
        }
        return false;
    }

    @Override
    public boolean enjoyingLife() {
        if (age > 18 && age < 55) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Проанализировав все данные: " +
                "canBreathe = " + canBreathe +
                ", name = '" + name + '\'' +
                ", age = " + age + ", " +
                ", writeCode = " + writeCode +
                ". Мы решили взять вас на работу.";
    }
}
