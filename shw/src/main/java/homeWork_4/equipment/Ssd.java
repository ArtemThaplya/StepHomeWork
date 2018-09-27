package homeWork_4.equipment;

public class Ssd {
    private final int AMOUNT_SSD = 500;
    private boolean state;
    private Cd cd = new Cd(isState());

    public int getAMOUNT_SSD() {
        return AMOUNT_SSD;
    }

    public Ssd(boolean state) {
        this.state = state;
    }

    private boolean isState() {
        return state;
    }

    public boolean isVirusTest() {
        boolean virus = true;
        return virus;
    }
}
