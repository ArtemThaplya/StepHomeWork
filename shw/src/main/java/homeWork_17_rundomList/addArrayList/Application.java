package homeWork_17_rundomList.addArrayList;

public class Application {
    public static void main(String[] args) {
        RandomAddArrayList randomAddList = new RandomAddArrayList();
        Thread thread = new Thread(randomAddList::inputSize);
        thread.start();
    }
}
