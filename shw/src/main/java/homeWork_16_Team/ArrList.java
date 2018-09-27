package homeWork_16_Team;

import java.util.ArrayList;

public class ArrList<T> {
    private ArrayList<String> arrayList;

     ArrList(ArrayList<String> arrayList) {
        this.arrayList = arrayList;
    }
    public ArrayList<String> getArrayList() {
        return arrayList;
    }

    @Override
    public String toString() {
        return "  Список скилов:  "+ arrayList + "\n";
    }
}
