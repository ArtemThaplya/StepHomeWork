package homeWork_8;

public class TelophoneStation {
    AbonentBase abonentBase1;
    AbonentBase abonentBase2;
    AbonentBase abonentBase3;
    AbonentBase abonentBase[];

    void base() {
        abonentBase1 = new AbonentBase("Artem", 0666111222, 64367, 100, true);
        abonentBase2 = new AbonentBase("Kolya", 0664561352, 85867, 100, true);
        abonentBase3 = new AbonentBase("Kolya", 0666111622, 94367, 100, true);
        abonentBase = new AbonentBase[]{abonentBase1, abonentBase2, abonentBase3};
    }
}
