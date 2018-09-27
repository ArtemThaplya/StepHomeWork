package homeWork_4;

import homeWork_4.equipment.Ssd;

class Computer extends SystemPC {
    private boolean state;
    private Ssd ssd;


    @Override
    void on() {
        ssd = new Ssd(true);
        this.state = true;
        System.out.println("Компьютер загружается!");
    }

    @Override
    void off() {
        ssd = new Ssd(false);
        this.state = false;
        System.out.println(toString() +"Компьютер выключается!");
    }

    void stateComputer() {
        if (state) {
            System.out.println(toString());
        } else System.out.println("Компьютер выключен!!!");

    }

    private boolean isState() {
        return state;
    }

    @Override
    public String toString() {
        return "Компьютер включен!!!" + "Проверка на вирусы: "
                + ssd.isVirusTest() + ". Размер жесткого диска: "
                + ssd.getAMOUNT_SSD() + "gb.\n"
                + "____________________________________________\n";
    }
}
