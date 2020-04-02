package shipLoading_Thread;

public class Ship extends Port {
    private int cargoPort;

    public boolean loadingShip(final int maxCargoShip, boolean cogestionShip) {
        if (!cogestionShip) {
            for (int i = 0; i < maxCargoShip; i++) {
                try {
                    cargoPort = chekedCargoPort(maxCargoShip);
                    cargoPort = unloadingShip(maxCargoShip, cogestionShip);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                cargoPort++;
            }
            cogestionShip = true;
        } else {
            System.out.println(Thread.currentThread().getName() + " Корабль полный.");
            cogestionShip = false;
        }
        return cogestionShip;
    }

    public int unloadingShip(final int maxCargoShip, boolean cogestionShip) {
        if (cogestionShip) {
            for (int i = maxCargoShip; i > 0; i--) {
                try {
                    cargoPort = chekedCargoPort(maxCargoShip);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                cargoPort++;
            }
        } else {
            System.out.println(Thread.currentThread().getName() + " Корабль разгружен!");
        }
        return cargoPort;
    }
}
