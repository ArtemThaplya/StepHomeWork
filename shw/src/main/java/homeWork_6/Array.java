package homeWork_6;

public class Array<T, I>  {
    private PerformOperations  performOperations = new PerformOperations();
    OneArray[] OneArray;

   public Array() {
        OneArray = new OneArray[3];
        for (int i = 0; i < 3; i++) {
            OneArray[i] = new OneArray();
        }

    }

    public void operations(){
        for (int i = 0; i < 3; i++) {
            double div = performOperations.div(OneArray[i].getA(),OneArray[i].getB(),OneArray[i].getY());
            int sum = performOperations.sum(OneArray[i].getA(),OneArray[i].getB(),OneArray[i].getY());
            int multiplication = performOperations.multiplication(OneArray[i].getA(),OneArray[i].getB(),OneArray[i].getY());
            System.out.println("Result, sum: " + sum + ", div: " + div + ", multiplication: " + multiplication + ".");
        }
    }
}
