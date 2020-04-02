package homeWork_17_rundomList.addLinkedList;

public class Application {
    public static void main(String[] args) {
        RandomAddLinkedList randomAddLinkedList = new RandomAddLinkedList();
        Thread myThready = new Thread(randomAddLinkedList::inputSize);
        myThready.start();
    }
}
