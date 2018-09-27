package homeWork_9_trains.trains;

public class Sitdown extends Train {
    private int passegMax;
    private int passegAl;
    private int bagaj;
    private int bagajMax;

    public Sitdown() {
    }

    public void setPassegAl(int passegAl) {
        this.passegAl = passegAl;
    }

    public int getPassegMax() {
        return passegMax;
    }

    public int getPassegAl() {
        return passegAl;
    }

    public Sitdown(int passegMax, int passegAl, int bagaj, int bagajMax) {
        this.passegMax = passegMax;
        this.passegAl = passegAl;
        this.bagaj = bagaj;
        this.bagajMax = bagajMax;
    }

    @Override
    int countPassenge() {
        return passegMax - passegAl;
    }

    @Override
    int countBagaj() {
        return bagajMax - bagaj;
    }

    @Override
    void allPassengeBagaj() {
        System.out.println("Количество свободных мест " + countPassenge() + " и багажа "
                + countBagaj() + ", в Дешевом вагоне: ");
    }
}
