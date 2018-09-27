package homeWork_21_TV_MapLab;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class TVandShow {
    private Map<String, String> networkMap = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    void menu() {
        System.out.println("Для завершения программы введите EXIT ");

        while (true) {
            String tv = inputTV();
            String show = inputShow();
            if (tv.equals("EXIT") | show.equals("EXIT")) {
                break;
            }
            addTVandShowInMap(tv, show);
            printTVandShow();
        }
    }

    private String inputShow() {
        System.out.println("Введите название шоу: ");
        return scanner.nextLine();
    }

    private String inputTV() {
        System.out.println("Введите название канала: ");
        return scanner.nextLine();
    }

    private void addTVandShowInMap(String tv, String show) {
        if (networkMap.get(tv) != null) {
            networkMap.merge(tv, show, (oldVal, newVal) -> oldVal + ",  " + newVal);
        } else {
            networkMap.put(tv, show);
        }

    }

    private void printTVandShow() {
        for (Map.Entry<String, String> pair : networkMap.entrySet()) {
            String key = String.valueOf(pair.getKey());
            String value = String.valueOf(pair.getValue());
            System.out.println("Input tv network: " + key + "\nInput tv show on ABC: " + value);
        }
    }
}
