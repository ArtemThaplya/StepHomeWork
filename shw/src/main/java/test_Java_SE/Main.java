package test_Java_SE;

public class Main {
    public static void main(String[] args) {
        Ship ship = new Ship();
        new Thread(() -> ship.unloadingShip(150_000, false)).start();
        new Thread(() -> ship.unloadingShip(150_000, false)).start();
        new Thread(() -> ship.loadingShip(150_000, false)).start();
        new Thread(() -> ship.unloadingShip(300_000, true)).start();
        new Thread(() -> ship.unloadingShip(300_000, true)).start();
        new Thread(() -> ship.loadingShip(300_000, false)).start();
        new Thread(() -> ship.unloadingShip(300_000, true)).start();

    }
}
