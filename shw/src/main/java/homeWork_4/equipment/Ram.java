package homeWork_4.equipment;

class Ram {
    private boolean state;
    private Cpu cpu = new Cpu(isState());

    Ram(boolean state) {
        this.state = state;
    }

    private boolean isState() {
        return state;
    }
}
