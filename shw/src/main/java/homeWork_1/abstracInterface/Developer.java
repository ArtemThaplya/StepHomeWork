package homeWork_1.abstracInterface;

public class Developer extends Profession {
    private String Specialty;

    public Developer(String name, String industry, String specialty) {
        super(name, industry);
        Specialty = specialty;
    }

    @Override
    void toDoWork() {
        if (Specialty != "разработчик") {
            System.out.println(toString());
        } else System.out.println(getName() + ", вы нам подходите!");
    }

    @Override
    public String toString() {
        return "Извитните " + getName() + ", но ваша спецификация: " + Specialty + ". " + "А нам нужен JAVA разработчик.";
    }
}
