package homeWork_1.abstracInterface;

public abstract class Profession {
    private String name;
    private String industry;

    public String getName() {
        return name;
    }

    abstract void toDoWork();

    Profession(String name, String industry) {
        this.name = name;
        this.industry = industry;
    }


}
