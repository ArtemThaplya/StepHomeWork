package homeWork_10.StarsSystems;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class MenuPrintConsole {
    private StarSystem starSystem = new StarSystem();
    private Star star = new Star();
    private Moon moon = new Moon();
    private Scanner scanner = new Scanner(System.in);
//    private Planet planet = new Planet();
//    Planet array[];

//    MenuPrintConsole() {
//        array = new Planet[8];
//        for (int i = 0; i < 7; i++) {       // второй    способ
//            array[i] = new Planet();
//        }
//    }

    void print() {
        starSystem.countPlane();
        System.out.println(toString());
        for (int i = 0; i < starSystem.array.length - 1; i++) {
            System.out.println("Имя планеты: " + starSystem.array[i].getName() + " и растояние до Солнца: "
                    + starSystem.array[i].getDistance());
        }
        addPlane();
    }

//     void secondWay(){
//        for (Planet anArray : array) {
//            System.out.println(anArray.getName() + " " + anArray.getDistance());         // второй    способ
//        }
//    }

    @Override
    public String toString() {
        return "Количество плант в солничной системе: " + starSystem.array.length + ".\n"
                + "Название звезды: " + star.getName() + ".\n"
                + "Название спутника Земли : " + moon.getName() + ".\n";
    }

    private void addPlane() {
        System.out.print("Добавте не достающую планету в Солничной системе(введите имя планеты): ");
        String name = scanner.nextLine();
        System.out.print("\n ведите растояние до солнца: ");
        int distance = Integer.parseInt(scanner.nextLine());

        Planet<String, Integer> planet = new Planet<>(name, distance);
        starSystem.array[7] = planet;
        System.out.println("Новая планета добавлена!\n" + "Имя планеты: "
                + starSystem.array[7].getName()
                + " и растояние до Солнца: "
                + starSystem.array[7].getDistance());
    }
}
