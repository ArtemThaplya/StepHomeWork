package homeWork_8;

public class CheckPositiveBalance {


    void checkBalance(AbonentBase abonentBase, int a) {
        if (a < 0) {
            abonentBase.setStatus(false);
            System.out.println("Действие услуг приостановлено. На вашем счете не достаточно средств!");
        }
    }
}
