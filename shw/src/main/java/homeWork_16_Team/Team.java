package homeWork_16_Team;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

import static homeWork_16_Team.Developer.*;

public class Team<T> {
    private Scanner scanner = new Scanner(System.in);
    private TreeMap<String, T> treeMap;

    void teamAll() {
        treeMap = new TreeMap<>();
        try {
            treeMap.put("Tsaplya Artem", (T) skil1);
            treeMap.put("Artur Majah", (T) skil2);
            treeMap.put("Bobrov Kirill", (T) skil3);
            treeMap.put("Agutin Sasha", (T) skil4);
        } catch (ClassCastException e) {
            System.out.println("Ошибка в касте классов! " + e);
        }
    }

    void printTeamDeveloper() {
        System.out.println("\nВся команда разрабочиков: \n" + treeMap);
    }

    void addDeveloper() {
        System.out.print("\nДобавим имя, фамилию(через пробел): ");
        String name = scanner.nextLine();
        String[] arraySkills = name.split(" ");

        System.out.print("\nДобавим скилы, разрабочкика(через пробел): ");
        String skills = scanner.nextLine();
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(skills.split(" ")));
        ArrList<T> arrList = new ArrList<>(arrayList);
        treeMap.put((arraySkills[0] + " " + arraySkills[1]), (T) arrList);

        System.out.println("\nЕсли хотите прордолжить добавлять разрабочиков, введите 1, если нет, любой другой символ: ");
        int number = Integer.parseInt(scanner.nextLine());
        if (number == 1){
            addDeveloper();
        }
    }
}
