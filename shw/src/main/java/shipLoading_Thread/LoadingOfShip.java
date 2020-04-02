package shipLoading_Thread;

public class LoadingOfShip {
    static int loadingOfShip(int cargoPort, int cargoShip){
        while (cargoPort > 0){
            cargoPort -= cargoShip;
        }
        return cargoPort;
    }
}
