package test_Java_SE;

public class LoadingOfShip {
    static int loadingOfShip(int cargoPort, int cargoShip){
        while (cargoPort > 0){
            cargoPort -= cargoShip;
        }
        return cargoPort;
    }
}
