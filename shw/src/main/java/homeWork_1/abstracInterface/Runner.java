package homeWork_1.abstracInterface;

public class Runner {
    static void runner() {
        Pilot pilot = new Pilot("Дима", "Авиационная", "1");
        Pilot pilotTwo = new Pilot("Вася", "Авиационная", "3");

        Developer developer = new Developer("Артем", "JAVA Developer", "разработчик");
        Developer developerFour = new Developer("Олег", "JAVA Developer", "web дизайнер");

        Profession developerTwo = new Developer("Коля", "Авиационная", "конструктор");
        Profession developerThree = new Developer("Саша", "Авиационная", "конструктор");

        pilot.toDoWork();
        pilotTwo.toDoWork();
        developer.toDoWork();
        developerFour.toDoWork();
        developerTwo.toDoWork();
        developerThree.toDoWork();
    }
}
