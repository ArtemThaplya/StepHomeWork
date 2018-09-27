package homeWork_9_trains.trains;

public class Low extends Train {
    private int passegMax;
    private int passegAl;
    private int bagaj;
    private int bagajMax;

    public Low() {
    }

    public int getPassegMax() {
        return passegMax;
    }

    public void setPassegAl(int passegAl) {
        this.passegAl = passegAl;
    }

    public int getPassegAl() {
        return passegAl;
    }

    public Low(int passegMax, int passegAl, int bagaj, int bagajMax) {
        this.passegMax = passegMax;
        this.passegAl = passegAl;
        this.bagaj = bagaj;
        this.bagajMax = bagajMax;
    }

    @Override
    void allPassengeBagaj() {
        System.out.println("Количество свободных мест " + countPassenge() + " и багажа "
                + countBagaj() + ", в Дешевом вагоне: ");
    }

    @Override
    int countPassenge() {
        return passegMax - passegAl;
    }

    @Override
    int countBagaj() {
        return bagajMax - bagaj;
    }
}
