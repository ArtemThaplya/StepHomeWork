package homeWork_1.abstracInterface;

public class Pilot extends Profession {
    private String typePlane;

    public Pilot(String name, String industry, String typePlane) {
        super(name, industry);
        this.typePlane = typePlane;
    }

    @Override
    void toDoWork() {
        if (typePlane != "1"){
            System.out.println(toString());
        } else{
            System.out.println(getName() + ", вы нам подходите!");
        }
    }

    @Override
    public String toString() {
        return "Извините " + getName() + ", но нам нужен пилот 1-го класса, а у вас " + typePlane + " класс!";
    }
}
