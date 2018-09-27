package homeWork_4.equipment;

class Cd {
    private boolean state;

    private Ram ram = new Ram(isState());

    Cd(boolean state) {
        this.state = state;
    }

    private boolean isState() {
        return state;
    }
}
