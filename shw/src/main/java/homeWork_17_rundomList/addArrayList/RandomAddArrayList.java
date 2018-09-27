package homeWork_17_rundomList.addArrayList;

import homeWork_17_rundomList.InputMenu;

import java.util.ArrayList;
import java.util.List;

public class RandomAddArrayList extends InputMenu {
    private List<Integer> arrayList = new ArrayList<>();

    void inputSize() {
        fillCollectionRandomNumberArrayList(inputMenuSize(), inputMenuRange(), arrayList);
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "RandomAddArrayList{" +
                "arrayList=" + arrayList +
                '}';
    }
}
