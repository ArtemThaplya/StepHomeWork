package shipLoading_Thread;

public class Port  {
    private int cargoPort = 1_000_000;

    int chekedCargoPort(int maxCargoShip) throws InterruptedException {
        if (maxCargoShip < cargoPort) {
            System.out.println(Thread.currentThread().getName()
                    + Thread.currentThread().getId()
                    +" Груз не влезет в порт!");
            Thread.sleep(5000);
            cargoPort = LoadingOfShip.loadingOfShip(cargoPort, maxCargoShip);
        } else {
            System.out.println(Thread.currentThread().getName()
                    + Thread.currentThread().getId()
                    +" Корабль загружен!");
            cargoPort -= maxCargoShip;
        }
        return cargoPort;
    }
}
