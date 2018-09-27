package homeWork_9_trains.trains;

public class Premium extends Train {
    private int passegMax;
    private int passegAl;
    private int bagaj;
    private int bagajMax;

    public void setPassegAl(int passegAl) {
        this.passegAl = passegAl;
    }

    public Premium() {
    }

    public int getPassegMax() {
        return passegMax;
    }

    public int getPassegAl() {
        return passegAl;
    }

    public Premium(int passegMax, int passegAl, int bagaj, int bagajMax) {
        this.passegMax = passegMax;
        this.passegAl = passegAl;
        this.bagaj = bagaj;
        this.bagajMax = bagajMax;
    }

    void allPassengeBagaj() {
        System.out.println("Количество свободных мест " + countPassenge() + " и багажа "
                + countBagaj() + ", в Премиум вагоне: ");
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
