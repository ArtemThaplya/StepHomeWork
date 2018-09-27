package homeWork_23_24_Alisa;

public class Main {
    public static void main(String[] args) throws Exception {
        String fileName = "alicet.txt";
        RepeatedWordsCounter repeatedWordsCounter = new RepeatedWordsCounter();
        repeatedWordsCounter.readFileAndPrintRepeatedWords(fileName);
    }
}
