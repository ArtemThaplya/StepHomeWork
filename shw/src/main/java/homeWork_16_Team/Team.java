package homeWork_16_Team;

import static homeWork_16_Team.Developer.person;
import static homeWork_16_Team.Developer.skill;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.logging.Logger;

class Team {

    private static Logger logger = Logger.getLogger(String.valueOf(Team.class));
    private Scanner scanner = new Scanner(System.in);
    private TreeMap<String, String> treeMap;

    void teamAll() {
        treeMap = new TreeMap<>();
        try {
            for (int i = 0; i < skill.length; i++) {
                treeMap.put(person[i], skill[i]);
            }
        } catch (ClassCastException e) {
            logger.info("Ошибка в касте классов! " + e);
        }
    }

    void loggTeamDeveloper() {
        treeMap.forEach((key, value) -> logger.info(key + ": [" + value + "]\n"));
    }

    void addDeveloper() {
        logger.info("\nДобавим имя, фамилию(через пробел): ");
        String name = scanner.nextLine();
        String[] arraySkills = name.split(" ");
        logger.info("\nДобавим скилы, разрабочкика(через пробел): ");
        String skills = scanner.nextLine();
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(skills.split(" ")));
        List<String> arrList = new ArrayList<>(arrayList);
        treeMap.put((arraySkills[0] + " " + arraySkills[1]),
            String.valueOf(arrList).replace("[", "").replace("]", ""));
        logger.info(
            "\nЕсли хотите продолжить добавлять разрабочиков, введите 1, если нет, любой другой символ: ");
        String input = scanner.nextLine();
        if (input.equals("1")) {
            addDeveloper();
        } else {
            loggTeamDeveloper();
        }
    }
}
